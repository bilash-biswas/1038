package main

import (
	"fmt"
)

func main() {
	var X, Y int
	var A, B, C, D, E float64
	fmt.Scan(&X)
	fmt.Scan(&Y)
	switch X {
	case 1:
		A = 4.00 * float64(Y)
		fmt.Printf("Total: R$ %.2f\n", A)
	case 2:
		B = 4.50 * float64(Y)
		fmt.Printf("Total: R$ %.2f\n", B)
	case 3:
		C = 5.00 * float64(Y)
		fmt.Printf("Total: R$ %.2f\n", C)
	case 4:
		D = 2.00 * float64(Y)
		fmt.Printf("Total: R$ %.2f\n", D)
	case 5:
		E = 1.50 * float64(Y)
		fmt.Printf("Total: R$ %.2f\n", E)
	}
}
