fun main(args: Array<String>) {
        val cars = listOf(
            car("Toyota", "Camry", "2.5Л"),
            car("Honda", "Step", "1.8Л"),
            car("Ford", "Mustang", "5.0Л")
        )

        val carPrinter = carPrinter()

        println("Cars:")
        cars.forEachIndexed { index, car ->
            println("$index: ${car.brand}")
        }

        print("Введите номер автомобиля, чтобы получить дополнительную информацию: ")
        val userInput = readLine()

        try {
            val selectedCarIndex = userInput?.toInt()
            if (selectedCarIndex != null && selectedCarIndex in cars.indices) {
                val selectedCar = cars[selectedCarIndex]
                carPrinter.printCarInfo(selectedCar)
            } else {
                println("Неверный Ввод. Пожалуйста, введите корректное число.")
            }
        } catch (e: NumberFormatException) {
            println("Неверный Ввод. Пожалуйста введите правильное число.")
        }
    }