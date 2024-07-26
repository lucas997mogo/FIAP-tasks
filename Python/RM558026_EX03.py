def calcular_emprestimo(valor_divida):
    tabela_juros_parcelas = {
        1: 0,
        3: 0.1,
        6: 0.15,
        9: 0.2,
        12: 0.25
    }

    print("Valor da Dívida | Valor do Juros | Quantidade de Parcelas | Valor da Parcela")
    print("----------------------------------------------------------------------------")

    for parcelas, percentual_juros in tabela_juros_parcelas.items():
        valor_juros = valor_divida * percentual_juros
        valor_total = valor_divida + valor_juros
        valor_parcela = valor_total / parcelas

        print(f"R$ {valor_total:.2f}         | R$ {valor_juros:.2f}        | {parcelas}                  | R$ {valor_parcela:.2f}")

valor_emprestimo = float(input("Digite o valor da dívida: R$ "))
calcular_emprestimo(valor_emprestimo)
