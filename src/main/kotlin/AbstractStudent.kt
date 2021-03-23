//import jogamp.graph.font.typecast.ot.table.Table.name
abstract class AbstractStudent(private val name: String, val isPresent: Boolean, val age: Int): GenericStudent {
    override fun getStudentName(): String{
        return name
    }
}