package com.example.examen.RecyclerView

/**
* Objecte singleton que proporciona dades en memòria
* per ser utilitzades al RecyclerView.
*/
object DataSource {
    val items: MutableList<MyItem> = mutableListOf(
        MyItem(
                id = 1,
                idusuari = 1,
                idmaterial = 1,
                datareserva = "2025-01-01T00:00:00",
                datafinal =  "2025-01-10T00:00:00",
                descripcio = "Ordinador portàtil HP",
                imatge = "imatge_hp.jpg"
        ),
        MyItem(
            id = 4,
            idusuari = 1,
            idmaterial =  4,
            datareserva = "2025-01-04T00:00:00",
            datafinal = "2025-01-13T00:00:00",
            descripcio = "Trípode Manfrotto Befree Advanced",
            imatge = "https://example.com/tripod1"
        )
    )
}