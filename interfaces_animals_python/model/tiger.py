from model.terrestrial import Terrestrial
from model.swimmer import Swimmer

class Tiger(Terrestrial, Swimmer):
    def terrestrial(self):
        print("El tigre puede correr")

    def swimmer(self):
        print("El tigre puede nadar")