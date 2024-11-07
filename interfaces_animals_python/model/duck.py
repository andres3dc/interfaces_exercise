from model.terrestrial import Terrestrial
from model.swimmer import Swimmer
from model.fly import Fly

class Duck(Terrestrial, Swimmer, Fly):
    def terrestrial(self):
        print("El patp puede correr")

    def swimmer(self):
        print("El pato puede nadar")

    def fly(self):
        print("El pato puede volar")

