class Student:
    def __init__(self, studentname, studentgrade, studentage):
        self.name = studentname
        self.grade = studentgrade
        self.age = studentage

    def display(self):
        print("Student name: ",self.name)
        print("Student grade:", self.grade)
        print("Student age:", self.age)

class School(Student):
    def schoolstudentdisplay(self):
        print("School Student name: ", self.name)
        print("School Student grade:", self.grade)
        print("School Student age:", self.age)

#Student class object
studentobject = Student("Chandni", "SDET Basic batch 1", 30)
studentobject.display()

#school class object
schoolobject = School("Dave", "SDET Basic batch 2", 23)
schoolobject.schoolstudentdisplay()