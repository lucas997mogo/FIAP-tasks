valor_carro = float(input("Digite o valor do carro: R$ "))

parcelas_disponiveis = [6, 12, 18, 24, 30, 36, 42, 48, 54, 60]

def calcular_preco_final(valor_carro, parcelas):
    desconto_avista = 0.2  # 20% de desconto para compra à vista
    acrescimo_por_parcela = {
        6: 0.03, 12: 0.06, 18: 0.09, 24: 0.12, 30: 0.15,
        36: 0.18, 42: 0.21, 48: 0.24, 54: 0.27, 60: 0.30
    }

    preco_final_avista = valor_carro * (1 - desconto_avista)

    tabela_parcelamento = []
    for parcela in parcelas:
        acrescimo = acrescimo_por_parcela.get(parcela, 0)
        preco_com_juros = valor_carro * (1 + acrescimo)
        valor_parcela = preco_com_juros / parcela
        tabela_parcelamento.append((preco_com_juros, parcela, valor_parcela))

    return preco_final_avista, tabela_parcelamento

def mostrar_tabela(valor_avista, tabela):
    print(f"\nValor à Vista: R${valor_avista:.2f}\n")
    print("Preço Final | Quantidade de Parcelas | Valor da Parcela")
    for preco_final, parcela, valor_parcela in tabela:
        print(f"R${preco_final:.2f}       | {parcela} parcelas          | R${valor_parcela:.2f}")


valor_avista, tabela_parcelamento = calcular_preco_final(valor_carro, parcelas_disponiveis)

mostrar_tabela(valor_avista, tabela_parcelamento)
