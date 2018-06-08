import itertools

def dfs(entrada, resto, k, j):
    maior_Atual = 0
    if (k == j and entrada > maior_Atual):
        maior_Atual = entrada

    for i in range(len(resto)):
        if((entrada & resto[i]) > maior_Atual):
            calc_Atual = dfs(entrada & resto[i], resto[i+1:], k, j+1)
            if calc_Atual > maior_Atual:
                maior_Atual = calc_Atual
    return maior_Atual

while True:
    try:
        entrada = input().split()
        parte2 = int(entrada[0])
        while(parte2 > 0):
            params = input().split(" ")
            x = int(params[0])
            y = int(params[1])

            if y > x:
                y = x

            numbers = input().split(" ")
            l = []
            for i in numbers:
                l.append(int(i))

            while(len(l) > x):
                l.pop()

            maior = 0
            for i in range(len(l)):
                resultadoPraUm = dfs(l[i], l[i + 1:], y, 1)
                if resultadoPraUm > maior:
                    maior = resultadoPraUm
            
            print(maior)

            parte2 = parte2 - 1

    except EOFError:
        break
