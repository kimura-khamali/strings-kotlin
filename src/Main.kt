//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//fun main() {
//   var place = 'K'//char or string
//    var person =" M"//only string
//}

/*
fun main() {
 var bucket = "bird"
 bucket = "birds"
}*/

//

/*fun main() {
    var name = "Jane"
    var age = "24"
    var occupation = "pilot"
    var statement = "$name, who is $age  years old is $occupation"
    println(statement)
}//string interpolation using of $ sign <better>-concatenate is using of + sign
*/
//String index (index-position)

/*fun main() {
    var fruit = "Avocado"//index-6    size of string-7
    //println(fruit[0])//in build fun to access first and last character of string without []
    /*println(fruit.first())
    println(fruit[3])*/
   // println(fruit.indexOf("o"))
    //println(fruit.indexOf("x"))//-1 not exist
    //println(fruit[7])//error
    println(fruit.indexOf(char = 'c'))
}*/

fun main () {
    val city = "kigali"
    val city2 = "kigalI"
    //println(city==city)
    //println(city.equals(city2)).
    println(city.uppercase())
    println(city.lowercase())
}


/*fun main() {
    val emptyString = ""
    val blankString = " "//a space does not make a string empty.
    println(emptyString.isEmpty())
    println(blankString.isEmpty())
    println(blankString.isBlank())
    println(blankString.isBlank())
}*/

/*fun main(){
    val city = " Kampala "
//    val city2 = "Kampala"
    println(city)//2 whitespace at the beginning and at end
    println(city.trimStart())//whitespace at the end no white space at the beginning
    println(city.trimEnd())//whitespace at the beginning no white at end
    println(city.trim())//no whitespace
}

fun println(startsWith: Any, s: String) {

}*/

/*//starts with or ends with
fun main () {
    val sentence = "Janet is the minister for finance"
    println(sentence.startsWith("Janet"))
    println(sentence.endsWith("Finance"))
}*/

/*//.replace()
fun main () {
    val sentence = "Janet is the minister for finance"
    //println(sentence.replace( "finance", "health"))//more characters
    println(sentence.replace( "i", "v"))//single character
}*/

//number
/*fun main() {
    var phoneNumber = "0723456536"
    if(phoneNumber.startsWith("07")) {

        val slice = phoneNumber.substring(startIndex = 1)
        phoneNumber = "+254$slice"
        println(phoneNumber)
    }
}*/

/*fun main() {
    var name = "Leaders"
    if (name.startsWith("Le")) {
        val slice = name.substring(startIndex = 2)
        name = "$slice"
        println(name)
    }
}*/


/*//private const
val email = "brendakhamali@gmail.com"
fun main() {
    val username = email.substringBefore(delimiter = "@", missingDelimiterValue = "Usernmae Not Found")
    println("Username -> $username")
}
// Output
//Username -> brendakhamali
*/

/*fun main() {
    val isEven: (Int) -> Boolean = { num -> num % 2 == 0 }

    val number = 7
    //val number = 7

    val result = isEven(number)
    println("$number is even: $result")
}*/

/*fun main() {
    calculate(13459)

}
fun calculate(number: Int): String {
    val isEven: (Int) -> Boolean = {num->num% 2 == 0}
    val result = isEven(number)
    println("$number is even: $result ")
    return "$number is even: $result "
}*/


/*fun main() {
    var weight =40.8
    println("$weight  kg is how much i weigh")
}*/


/*fun main() {
    var sentence = "A small bird perched on the rear window"//Delimiter
    println(sentence.split( " "))//[A, small,---]
    println(sentence.split( ","))//[A, small,---]
    println(sentence.split( "p"))//a small bird , arched---
    println(sentence.split( ""))//A, ,S,M,-----
}                                */
/*fun main() {
    var email = "kimurakhamali@gmail.com"//Delimiter
    val username = email.split( "@")
    println(username)
}*/


//Assessment
/*fun main() {
    name("Anne")
}
    fun name(word: String) {

        if ( word  == "Brenda") {
            println("That's me!")
        } else {
            println("That's not me")
        }
    }*/


/*fun main() {
    var name ="AkiraChix"
    //println(name.first())
    //println(name[3])
    var text = (name[0] + ' '.code + name[3].code + ' ' .code + name[4].code)
    println(text)
}*/

/*fun main() {
pre(word:"Akirachix")

}

fun pre(word:String) {

    var a = word[0]
    var b = word[3]
    var c = word[4]
    println($a $b $c)
}*/

/*fun main() {
println((bb("ven", 33)))
   //(bb("ven", 33)
}
fun bb(name: String, age: Int): String{

  val statement ="Hi my name is $name and I am $age years old"
   // println(statement)
    return statement

}*/

/*fun main() {
    var name = "AdaLab Class"
    println(name.length)
}*/


/*fun main(){
    var name = "Ada"
    println(name.length)

}*/

//write a kotlin application that takes the radius of a circle as input from the user and calculate the area and circumference of the circle.the program shld display both radius
//fun main() {
//
//}
//fun area() {
//
//}

//Develop a  kotlin application that takes the marks  of a student  to five subject input from the user.the program should calculate the average mark

/*fun main() {
    word("Caren")
    record("Ann",20,"0754673335",56.0,"Kenyan" )
    isEven(9)
}
fun word(name:String): String {
    println(name.length)
    return name

}
fun record(fullName:String,age:Int,phoneNumber:String,weight:Double,citizen:String) {
    println(fullName)
    println(age)
    println(phoneNumber)
    println(weight)
    if(citizen== "Kenyan") {
        println("Kenyan")
    }else {
        println("Not Kenyan")
    }
}

fun isEven(num: Int):Boolean {
    if(num% 2==0){
        println("Even")
        return true
    }else{
        println("odd")
        return false
    }
}*/


/*fun main() {
    var name = "Leadersthe"
    if (name.startsWith("Le")) {
        val slice = name.substring( 1 .. 5)
        name = "$slice"
        println(name)
    }
}*/
