package com.econotravel.api.repositories;

import com.econotravel.api.domain.Experience;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

import java.math.BigDecimal;
import java.util.List;


@Component
public class SampleDataLoader {
    private final ExperienceRepository experienceRepository;

    @Autowired
    public SampleDataLoader(ExperienceRepository experienceRepository) {
        this.experienceRepository = experienceRepository;
    }


    @PostConstruct
    public void loadSampleData() {
        experienceRepository.saveAll(List.of(
                new Experience("Paseo en Bicicleta por Montseny", new BigDecimal(250), 5, "Actividad disponible para todas las edades. Disponemos de bicicletas accesibles para personas con movilidad reducida en el tren inferior así como sillines con capacidad para niños menores de 5 años (peso máximo 20kg", "Montaña, bicicleta, excursión larga.", "Disfruta de un hermoso paseo en bicicleta por el increíble Parque Natural del Montseny. Una escapada veraniega perfecta para parejas, familias y amigos que nos permitirá conocer nuevos y sorprendentes lugares. El recorrido que os proponemos comienza con una larga subida con algunos descansos, combinando asfalto y pistas anchas, culminando en un mirador con magníficas vistas del Vallés y el mar. Desde aquí continuaremos la bajada combinando senderos, pistas y algún tramo de carretera y terreno mixto para visitar la zona de Santa Fe, donde descubriremos la Ermita y el Bosque de las Secuoyas. Para finalizar, acudiremos al restaurante María Rosa de Palautordera, donde disfrutaremos de una excelente comida casera con butifarra blanca y negra y munxetes del Montseny.","https://i.ibb.co/QmJ0QJy/bici.png" ),

                new Experience("Arte en la montaña sagrada ", new BigDecimal(125), 2, "Actividad disponible para todas las edades. Disponemos de bicicletas accesibles para personas con movilidad reducida en el tren inferior así como sillines con capacidad para niños menores de 5 años (peso máximo 20kg",  "Montaña, a pie, excursión corta.", "Disfruta de la impresionante Montaña de Montserrat donde encontraréis el Museo con las salas modernistas de Puig i Cadafalch, lugar que acoge colecciones de gran valor en el corazón de la emblemática montaña. En el Museo encontraréis pinturas del Renacimiento y del Barroco que conviven con autores de los siglos XIX y XX, objetos del Próximo Oriente y orfebrería. Además de disfrutar de un paseo guiado por la montaña y el Museo, esta actividad incluye tentempié variado acompañado de vino espumoso, cava brut o refresco.","https://i.ibb.co/k3CCRxJ/montserrat.png" ),

                new Experience("Descubre la costa en barco de vela", new BigDecimal(280), 4, "Actividad disponible para todas las edades. Pasarela para silla de ruedas disponible bajo reserva.", "Playa, barco, excursión larga.", "Disfruta de un hermoso paseo acuático en barco de vela por la increíble costa de Barcelona. Una escapada veraniega apta incluso para los días más calurosos del año. Descubre los encantadores alrededores de la ciudad de Barcelona y visita desde el mar sus más impresionantes playas y cala. Comenzaremos la excursión en el Puerto de Barcelona, desde donde partiremos hacia el norte para visitar playas como la Mar Bella, la Playa de la Mora y la Playa de los Pescadores. A bordo de la embarcación podremos disfrutar de una selección de quesos y embutidos catalanes acompañada de cava brut y zumos de frutas. Asimismo, pararemos cerca de la Playa de Montgat para realizar una actividad de buceo de superficie que nos permitirá apreciar la diversidad de la fauna marítima local y su ecosistema. Finalizaremos la excursión en el mismo puerto del que partimos.","https://i.ibb.co/Q86rmWD/barco.png" ),

                new Experience("Descubre la Barcelona Modernista de noche", new BigDecimal(200), 4, "Actividad disponible para todas las edades. Accesibilidad garantizada para sillas de ruedas.", "Ciudad, a pie, excursión larga.", "Desplazarse a pie es una de las mejores formas de descubrir las maravillas modernistas que se esconden en el barcelonés distrito del Eixample, ubicado en el centro de la ciudad. En esta excursión de cuatro horas, descubriremos los principales emblemas del modernismo y visitaremos los templos y edificios más célebres del arquitecto Gaudí. El tour incluye visita guiada al interior de la Casa Batlló y la Sagrada Familia, así como parada para cenar en el restaurante típico catalán Can Masiá, donde disfrutaremos de las mejores carnes de la región acompañadas de vinos de las tierras del Baix Empordá. El restaurante también ofrece opciones vegetarianas y veganas así como menú para niños. Cava aparte.","https://i.ibb.co/zxQr4Zx/bcnmodernista.png" ),

                new Experience("Del huerto a la mesa ", new BigDecimal(145), 3, "Actividad disponible para todas las edades. El acceso al huerto en silla de ruedas está garantizado.", "Montaña, a pie, excursión corta.", "Comparte con los más pequeños las maravillas de la naturaleza. En esta excursión breve de tres horas, podréis plantar vuestras propias hortalizas y verduras en el huerto de Can Gilabert, ubicado en el corazón del Montbaig. Durante una hora y media, aprenderéis a cuidar de vuestro propio huerto, plantaréis y abonaréis vuestras propias plantas, y también recogeréis parte de los ingredientes que los expertos chefs de Can Gilabert utilizarán para preparar la posterior cena, donde disfrutaréis de la experiencia de consumir productos recién recogidos de la tierra con vuestras propias manos. Actividad ideal para familiarizar a los más pequeños de la familia con el estilo de vida rural y la agricultura sostenible. Asimismo, obtendréis como obsequio una botella de aceite virgen extra cultivado y preparado en Can Gilabert, obra de la familia Gilabert, que lleva más de 80 años cultivando olivos.", "https://i.ibb.co/4PbxDWG/hierta.png")



        ));

    }


}
