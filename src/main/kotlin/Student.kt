class Student (name: String, isPresent: Boolean, age: Int): AbstractStudent(name, isPresent, age)
 {

    override fun getStudentAttendance(): Boolean {
        return isPresent
    }
    override fun getStudentAge(): Int {
        return age
    }
}