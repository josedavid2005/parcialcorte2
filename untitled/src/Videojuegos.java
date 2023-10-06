enum VideoJuegos {
    DEPORTIVOS("NBA","control","2023"){
        @Override
        public String mostrarPosicionRanking() {
            return "videojuego de baloncesto del 2023 desarrollado por Visual Concepts y publicado por 2K";
        }

        @Override
        public String comprarMonedas() {
            return "20 dolares 1000 monedas";
        }
    },
    ESTRATEGIA("Age of Empires III","control","2005"){
        @Override
        public String mostrarPosicionRanking() {
            return "videojuego de estrategia en tiempo real para computadoras";
        }

        @Override
        public String comprarMonedas() {
            return "5 dolares 100 monedas";
        }
    },
    MUSICALES("guitarhero","guitarra","2000"){
        @Override
        public String mostrarPosicionRanking() {
            return "#2 en juegos musicales retro";
        }

        @Override
        public String comprarMonedas() {
            return "10 dolares 500 monedas";
        }
    },
    AVENTURA("The Legend of Zelda: Breath of the Wild 2","control","2023"){
        @Override
        public String mostrarPosicionRanking() {
            return " es un videojuego de acción-aventura de 2023 de la serie The Legend of Zelda";
        }

        @Override
        public String comprarMonedas() {
            return "30 dolares 10000 monedas";
        }
    },
    SIMULACION("The Sims 4","controles","2014"){
        @Override
        public String mostrarPosicionRanking() {
            return "es un videojuego de simulación social y de vida, el cuarto de la serie de juegos de Los Sims";
        }

        @Override
        public String comprarMonedas() {
            return "6 dolares 300 monedas";
        }
    };

    private String nombrejuego;
    private String comojugar;
    private String añodecreacion;

    public String getNombrejuego() {
        return nombrejuego;
    }

    public void setNombrejuego(String nombrejuego) {
        this.nombrejuego = nombrejuego;
    }

    public String getComojugar() {
        return comojugar;
    }

    public String getAñodecreacion() {
        return añodecreacion;
    }

    VideoJuegos(String nombrejuego, String comojugar, String añodecreacion) {
        this.nombrejuego = nombrejuego;
        this.comojugar = comojugar;
        this.añodecreacion = añodecreacion;

    }
    public abstract String mostrarPosicionRanking();
    public abstract String comprarMonedas();
}