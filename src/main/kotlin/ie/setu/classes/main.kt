package ie.setu.classes

private val persons = ArrayList<Person>()
fun main(args: Array<String>){
    persons.add(Person("Mark","Roche"))
    persons.add(Person("John", "Walsh"))
    persons.add(Person("Sheila", "Flynn"))
    personalInfo()

    for ((index, value) in persons.withIndex())
        println("$index: $value")
}
fun personalInfo() {
    val person1 = Person("Mark", "Roche")
    val person2 = person1.copy(firstName = "Clare")
    val person3 = person1.copy()

    println("person1 hashcode = ${person1.hashCode()}")
    println("person2 hashcode = ${person2.hashCode()}")
    println("person3 hashcode = ${person3.hashCode()}")

    if (person1.equals(person2))
        println("Person 1 equals person 2")
    else
        println("Person 1 is not equal to person 2")

    if (person1.equals(person3))
        println("Person 1 equals person 3")
    else
        println("Person 1 does not equal person 3")

    println("\nUsing Lambdas:\n")
    println("\nFiltering first name as John: ")
    persons
        .sortedBy {it.lastName}
        .forEach {println("Person : ${it.firstName}, ${it.lastName.uppercase()}")}


}


