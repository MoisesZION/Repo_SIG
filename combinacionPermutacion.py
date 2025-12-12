def factorial(numero):
    resultado = 1
    for i in range(1, numero + 1):
        resultado = resultado * i
    return resultado


numero1 = int(input("Ingrese el numero 1 (n): "))
numero2 = int(input("Ingrese el numero 2 (r): "))

if numero2 > numero1:
    print("Pilas: el numero 2 no puede ser mayor que el numero 1.")
else:
    factorialNumero1 = factorial(numero1)
    factorialNumero2 = factorial(numero2)
    factorialDiferencia = factorial(numero1 - numero2)

    C = factorialNumero1 // (factorialNumero2 * factorialDiferencia)
    P = factorialNumero1 // factorialDiferencia

    print("Combinatoria C(n, r):", C)
    print("Permutacion P(n, r):", P)