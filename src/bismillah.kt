import java.util.*

// membuat project iseng iseng


fun welcam (){
    println ("Selamat datang di MY APP")
}
fun asep() {
    val userInput = Scanner(System.`in`)
    val pin1 = "masukkan pin anda : "
    print(pin1)
    val pin2 = userInput.nextInt()
    if (pin2 != 123) {
        println("Maaf Asep.. pin Anda Salah, Mohon coba kembali")
        asep()
    } else {
        println("Pin berhasil dimasukkan")
        println("Hallo Selamat datang Asep Sutisna")
        println("Welcome My APP")
    }
}

fun doni() {

    val userInput = Scanner(System.`in`)
    val pin2 = "masukkan pin anda : "
    print(pin2)
    val pin1 = userInput.nextInt()
    if (pin1 != 234) {
        println("Maaf Doni.. Pin Anda Salah, Mohon coba kembali")
        doni()
    } else {
        println("Pin berhasil dimasukkan")
        println("Hallo Selamat datang Rizky Ramdoni")
        println("Welcome My APP")
    }
}

fun roby(){
    val userInput = Scanner(System.`in`)
    val pin3 = "masukkan pin anda : "
    print(pin3)
    val pin2 = userInput.nextInt()
    if (pin2 != 345) {
        println("Maaf Roby.. Pin Anda Salah, Mohon coba kembali")
        roby()
    } else {
        println("Pin berhasil dimasukkan")
        println("Hallo Selamat datang Roby Fenki")
        println("Welcome My APP")
    }
}
// minumkopi
class Product(private var name: String, private var price: Int) {
    fun getPrice() = price
    override fun toString(): String {
        return "$name Rp.$price"
    }
}

abstract class Shipping {
    abstract fun calculate(product: Product): Int
    abstract override fun toString(): String
}

class JNEShipping: Shipping() {
    override fun calculate(product: Product): Int {
        return product.getPrice() + 7000
    }
    override fun toString(): String {
        return "+15 Menit = Rp. 7000"
    }
}

class TIKIShipping: Shipping() {
    override fun calculate(product: Product): Int {
        return product.getPrice() + 10000
    }
    override fun toString(): String {
        return "+10 Menit = Rp. 10000"
    }
}

class POSIndoShipping: Shipping() {
    override fun calculate(product: Product): Int {
        return product.getPrice() + 12000
    }
    override fun toString(): String {
        return "+5 Menit = Rp. 12000"
    }
}

class SiCepatShipping: Shipping() {
    override fun calculate(product: Product): Int {
        return product.getPrice() + 15000
    }
    override fun toString(): String {
        return "+1 Menit = Rp. 15000"
    }
}

class ShippingOrderService {
    fun checkout(product: Product, shipping: Shipping): Int {
        return shipping.calculate(product)
    }
}

fun printData(data: Collection<*>) {
    var count = 1
    println()
    data.forEach { text ->
        println("$count. $text")
        count++
    }
}

// isi program
fun main() {

    welcam()
    val userInput = Scanner(System.`in`)
    while (true) {
        println("Nama Karyawan:")
        val Nama = """
        1. Asep Sutisna
        2. Rizky Ramdoni
        3. Roby Fenki
    """.trimIndent()
        println(Nama)
        print("Siapakah anda? pilih nomor disini (1/2/3): ")
        val namaAnda: String? = userInput.nextLine()
        if (namaAnda == "1") {
            asep()
        } else if (namaAnda == "2") {
            doni()
        } else if (namaAnda == "3") {
            roby()
        } else {
            println("Maaf anda tidak memasukkan nomor yang tepat..silahkan ulangi kembali :")
            continue
        }
        print("Anda ingin melanjutkan tour ini [y/n] ? ")
        val answer = userInput.nextLine()
        if (answer == "y") {
            break
        }

    }

    val totalCost: Int
    var promptFood: Int
    val userInput1 = Scanner(System.`in`)
    val foodData = mutableListOf(Product("Kopi Indocafe Harga =", 15000),
        Product("Kopi Good Day Cappucino Harga =", 10000), Product("Kopi ABC Harga =", 8000))
    val shippData = listOf(JNEShipping(), TIKIShipping(), POSIndoShipping(),
        SiCepatShipping())

    println("Apakah anda ingin ditemani Kopi?")

    while (true) {
        printData(foodData)
        print("pilih kopi yang anda suka  : ")
        promptFood = userInput1.nextInt()
        if (promptFood == 1) {
            break
        } else if (promptFood == 2) {
            break
        } else if (promptFood == 3) {
            break
        }
    }

    while (true) {
        printData(shippData)
        print("Seberapa lama kopi ingin diantarkan? : ")
        val promptName = userInput1.nextInt()
        if (promptFood == 1) {
            totalCost = ShippingOrderService()
                .checkout(foodData[promptFood - 1], shippData[promptName - 1])
            break
        } else if (promptFood == 2) {
            totalCost = ShippingOrderService()
                .checkout(foodData[promptFood - 1], shippData[promptName - 1])
            break
        } else if (promptFood == 3) {
            totalCost = ShippingOrderService()
                .checkout(foodData[promptFood - 1], shippData[promptName - 1])
            break
        }
    }

    println("\nYou must pay : Rp.$totalCost")

    println("\nTerimakasih harap ditunggu ya :)")
    while (true) {
        print("Apakah anda ingin sarapan juga? [y/n] ? ")
        val answer = userInput.nextLine()
        if (answer == "y") {
            break
        }
    }
    var promptFood1: Int
    val userInput2 = Scanner(System.`in`)
    val foodData1 = mutableListOf(Product("Ayam Goyeng + Nasi Harga =", 25000),
        Product("Nasi Goyeng Spesial. Harga =", 20000), Product("Mie Goyeng Komplit. Harga =", 20000))


    while (true) {
        printData(foodData1)
        print("pilih sarapan yang kamu mau: ")
        promptFood1 = userInput2.nextInt()
        if (promptFood1 == 1) {
            println("Anda telah memilih Ayam Goyeng + Nasi. seharga Rp. 25000")
            println("Terimakasih sarapan anda pun akan segera kami siapkan :)")
            break
        } else if (promptFood1 == 2) {
            println("Anda telah memilih Nasi Goyeng Spesial. seharga Rp. 20000")
            println("Terimakasih sarapan anda pun akan segera kami siapkan :)")
            break
        } else if (promptFood1 == 3) {
            println("Anda telah memilih Mie Goyeng Komplit. seharga Rp. 20000")
            println("Terimakasih sarapan anda pun akan segera kami siapkan :)")
            break
        }

    }

    println("Terimakasih anda sudah diujung programnya. silahkan kembali lagi")
    while (true) {
        print("Apakah anda ingin mengakhiri program ini? [y/n] ? ")
        val answer = userInput.nextLine()
        if (answer == "y") {
            break
        }

    }
}