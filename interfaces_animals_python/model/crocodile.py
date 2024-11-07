from model.terrestrial import Terrestrial
from model.swimmer import Swimmer

class Crocodile(Terrestrial, Swimmer):
    def terrestrial(self):
        print("El cocodrilo puede correr")

    def swimmer(self):
        print("El cocodrilo puede nadar")