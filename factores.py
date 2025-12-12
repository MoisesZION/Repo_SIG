def factores_primos(n):
    i = 2
    while i <= n and n > 1:
        while n % i == 0:
            print(i, end=" ")
            n = n // i
        i += 1

n = int(input("Ingresa un numero: "))
print("Los factores primos del numero", n, "son:", end=" ")
factores_primos(n)
