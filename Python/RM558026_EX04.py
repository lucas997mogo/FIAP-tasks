def calcular_ir(tipo_investimento, valor_resgate, dias_investidos):
    if tipo_investimento == 1:  # CDB
        if dias_investidos <= 180:
            aliquota_ir = 0.225
        elif 181 <= dias_investidos <= 360:
            aliquota_ir = 0.2
        elif 361 <= dias_investidos <= 720:
            aliquota_ir = 0.175
        else:
            aliquota_ir = 0.15
    elif tipo_investimento == 2 or tipo_investimento == 3:  # LCI ou LCA
        aliquota_ir = 0 
    else:
        print("Tipo de investimento inválido.")
        return None

    valor_ir = valor_resgate * aliquota_ir
    return valor_ir

while True:
    tipo_investimento = int(input("Digite o tipo de investimento (1 para CDB, 2 para LCI e 3 para LCA): "))
    if tipo_investimento not in [1, 2, 3]:
        print("Tipo de investimento inválido. Tente novamente.")
        continue

    valor_resgate = float(input("Digite o valor a ser resgatado: "))
    dias_investidos = int(input("Digite o número de dias que o valor permaneceu investido: "))

    valor_imposto_renda = calcular_ir(tipo_investimento, valor_resgate, dias_investidos)
    if valor_imposto_renda is not None:
        print(f"O valor do imposto de renda a ser pago é: R$ {valor_imposto_renda:.2f}")
    break
