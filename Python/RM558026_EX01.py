num_colaboradores = int(input("Digite o número de colaboradores que irão participar da votação: "))

preferencias = {'segunda-feira': 0, 'terça-feira': 0, 'quarta-feira': 0, 'quinta-feira': 0, 'sexta-feira': 0}

for i in range(num_colaboradores):
    while True:
        dia_preferido = input(f"Colaborador {i+1}, escolha um dia da semana (segunda-feira, terça-feira, quarta-feira, quinta-feira, sexta-feira): ")
        if dia_preferido.lower() in preferencias:
            preferencias[dia_preferido.lower()] += 1
            break
        else:
            print("Dia da semana inválido. Tente novamente.")

dia_mais_escolhido = max(preferencias, key=preferencias.get)

print(f"O dia mais escolhido pelos colaboradores para a realização das lives é: {dia_mais_escolhido.capitalize()}")
