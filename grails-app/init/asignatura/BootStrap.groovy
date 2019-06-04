package asignatura

class BootStrap {

    def init = { servletContext ->
        //{name:"Domingo",class:[{},{}]}
        new Dia(name: "Domingo", clas: new Asignatura(name: "Liderasgo y emprendimiento", ncr: "1253", startHour: "10", finalHour: "12", room: "A3-401").save()).save()
        new Asignatura(name: "Liderasgo y emprendimiento", ncr: "1253", startHour: "10:00", finalHour: "12:00", room: "A3-401").save()
        new Asignatura(name: "Ingles III", ncr: "1951", startHour: "14:00", finalHour: "15:00", room: "A2-305").save()
        new Asignatura(name: "Patrones", ncr: "1148", startHour: "15:00", finalHour: "16:00", room: "A1-400").save()
        new Asignatura(name: "Ingles III", ncr: "1951", startHour: "14:00", finalHour: "15:00", room: "A2-304").save()
        new Asignatura(name: "Sistemas operativos", ncr: "1167", startHour: "15:00", finalHour: "16:00", room: "A2-204").save()
        new Asignatura(name: "Simulacion y sistemas dinamicos", ncr: "1184", startHour: "18:00", finalHour: "19:00", room: "A2-401").save()
        new Asignatura(name: "Simulacion y sistemas dinamicos", ncr: "1184", startHour: "18:00", finalHour: "19:00", room: "A2-401").save()

    }
    def destroy = {
    }
}
