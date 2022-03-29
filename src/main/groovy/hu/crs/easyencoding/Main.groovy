package hu.crs.easyencoding

class Main {
    static Map<Character, Coordinate> codebook = [
        'K': new Coordinate(col: 'A' as char, row: 1),
        'L': new Coordinate(col: 'B' as char, row: 1),
        'M': new Coordinate(col: 'C' as char, row: 1),
        'N': new Coordinate(col: 'D' as char, row: 1),

        'H': new Coordinate(col: 'A' as char, row: 2),
        'I': new Coordinate(col: 'B' as char, row: 2),
        'Í': new Coordinate(col: 'C' as char, row: 2),
        'J': new Coordinate(col: 'D' as char, row: 2),

        'Ó': new Coordinate(col: 'A' as char, row: 3),
        'Ő': new Coordinate(col: 'B' as char, row: 3),
        'P': new Coordinate(col: 'C' as char, row: 3),
        'Q': new Coordinate(col: 'D' as char, row: 3),

        'Ü': new Coordinate(col: 'A' as char, row: 4),
        'Ű': new Coordinate(col: 'B' as char, row: 4),
        'V': new Coordinate(col: 'C' as char, row: 4),
        'W': new Coordinate(col: 'D' as char, row: 4),

        'G': new Coordinate(col: 'A' as char, row: 5),
        'O': new Coordinate(col: 'B' as char, row: 5),
        'Ú': new Coordinate(col: 'C' as char, row: 5),
        'X': new Coordinate(col: 'D' as char, row: 5),

        'D': new Coordinate(col: 'A' as char, row: 6),
        'E': new Coordinate(col: 'B' as char, row: 6),
        'É': new Coordinate(col: 'C' as char, row: 6),
        'F': new Coordinate(col: 'D' as char, row: 6),

        'A': new Coordinate(col: 'A' as char, row: 7),
        'Á': new Coordinate(col: 'B' as char, row: 7),
        'B': new Coordinate(col: 'C' as char, row: 7),
        'C': new Coordinate(col: 'D' as char, row: 7),

        'R': new Coordinate(col: 'A' as char, row: 8),
        'S': new Coordinate(col: 'B' as char, row: 8),
        'T': new Coordinate(col: 'C' as char, row: 8),
        'U': new Coordinate(col: 'D' as char, row: 8),

        'Z': new Coordinate(col: 'A' as char, row: 9),
        'Y': new Coordinate(col: 'B' as char, row: 9),
        'Ö': new Coordinate(col: 'C' as char, row: 9),
        '.': new Coordinate(col: 'D' as char, row: 9),

        ',': new Coordinate(col: 'D' as char, row: 10),
        '!': new Coordinate(col: 'D' as char, row: 10),
        '?': new Coordinate(col: 'D' as char, row: 10),
        ' ': new Coordinate(col: 'D' as char, row: 10),
    ]

    static void main(String[] args) {
        println encode("Már egy hete folyton csak esett az eső.")
        println encode("Egérkéék földbe vájt lakását elöntötte a víz.")
        println encode("Csak az éléskamra maradt szárazon.")
        println encode("Itt szoronkodott az egész család, az egérgyerekek nagy örömére.")
        println encode("Reggeltől estig papsajtot rágicsáltak meg repcemagot.")
        println encode("Egérkének időnként eszébe jutott Mazsola a kismalac.")
    }

    static private String encode(String plainText) {
        return plainText.toUpperCase().split("").collect {c -> codebook[c]}
    }


    static class Coordinate {
        char col
        int row

        String toString() {
            return "$col$row"
        }
    }
}
