package asignatura

class BootStrap {

    def init = { servletContext ->
        //{name:"Domingo",class:[{},{}]}
        new Dia(name: "Domingo", clas: new Asignatura(name: "Liderasgo y emprendimiento", ncr: "1253", startHour: "10", finalHour: "12", room: "A3-401").save()).save()
        new Asignatura(nombre: "Liderasgo y emprendimiento", ncr: "1253", hora_i: "10:00", hora_f: "12:00", dia: "lunes", salon: "A3-401").save()
        new Asignatura(nombre: "Ingles III", ncr: "1951", hora_i: "14:00", hora_f: "15:00", dia: "Lunes", salon: "A2-305").save()
        new Asignatura(nombre: "Patrones", ncr: "1148", hora_i: "15:00", hora_f: "16:00", dia: "Lunes", salon: "A1-400").save()
        new Asignatura(nombre: "Ingles III", ncr: "1951", hora_i: "14:00", hora_f: "15:00", dia: "Martes", salon: "A2-304").save()
        new Asignatura(nombre: "Sistemas operativos", ncr: "1167", hora_i: "15:00", hora_f: "16:00", dia: "Martes", salon: "A2-204").save()
        new Asignatura(nombre: "Simulacion y sistemas dinamicos", ncr: "1184", hora_i: "18:00", hora_f: "19:00", dia: "Martes", salon: "A2-401").save()
        new Asignatura(nombre: "Simulacion y sistemas dinamicos", ncr: "1184", hora_i: "18:00", hora_f: "19:00", dia: "Martes", salon: "A2-401").save()

    }
    def destroy = {
    }
}
