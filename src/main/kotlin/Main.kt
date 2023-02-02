

const val firstName = "Joe"
const val surname = "Soap"
const val gender = "M"
val employeeId = 6143
val grossSalary = 67543.21
val payePercentage = 38.5
val prsiPercentage = 5.2
const val anualBonusAmount =1450.50
const val cycleDeduction =54.33


fun monthlySalary() = grossSalary / 12


fun main() {
    val monthlyPrsi = monthlySalary() * (prsiPercentage / 100)
    val monthlyPaye = monthlySalary() * (payePercentage / 100)
    val grossPay = (monthlySalary() + (anualBonusAmount/12))
    val totalDeductions = (monthlyPrsi + monthlyPrsi + cycleDeduction)


    println("|_______________________________________________________________________|")
    println("              " +
                          "   Monthly Payslip   "+                  employeeId +
            "              ")
    println()
    println("|_______________________________________________________________________|")

    println("Employee Name: $firstName $surname($gender)")

    println("|_______________________________________________________________________|")
    println ("|    PAYMENT DETAILS \t\t\t\t Deductions DETAILS  \t\t\t\t|")
    println ("|_______________________________________________________________________|")
    println ("|    Salary: " + monthlySalary() + "\t\t PAY: " + monthlyPaye + "\t\t\t|")

    println ("|    Bonus:  " + (anualBonusAmount / 12) + "\t\t\t\t PRS: " + monthlyPrsi  + "\t\t\t|")
    println ("|    \t\t\t\t\t\t\t\t Cycle To Work: $cycleDeduction\t\t\t\t|")
    println ("|_______________________________________________________________________|")
    println ("|    Gross:  " + grossPay + " \t\t  Total Deductions: " + totalDeductions + " |")
    println ("|_______________________________________________________________________|")
    println ("|   \t\t\t\t  NET PAY:" + (grossPay - totalDeductions) + "  \t\t\t\t\t\t\t|")
    println ("|_______________________________________________________________________|")
}


