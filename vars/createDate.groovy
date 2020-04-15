def sprintLenght = 14
def start = new Date(120,0,1)
def today = new Date()
def someDate

use(groovy.time.TimeCategory) {
    someDate = (today - start).days

}

println someDate
println ((int)Math.floor(208 + someDate/sprintLenght))

