/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.endgame;

/**
 *
 * @author carlo
 */
public class EndGame {

    public static void main(String[] args) {
        Heroe blackPanter=new Heroe("black Panter","ser el rey de todo Wakanda","Garras de Vibranium");
        Villano galactus=new Villano("Galactus","Devorar mundos","Silver Surfer");
        Avenger ironMan=new Avenger("Tony Stark","Genio;Filsntropo,Multimillonario,Playboy","Mark 42","P2rime");
        Thanos thanos=new Thanos("Thanos","El titan loco","Ejercito Chitaury","Guantelete");
        
        //aplicando polimorfismo
        
        Personaje[]personajes={blackPanter,galactus,ironMan,thanos};
        for(Personaje personaje:personajes){
            personaje.atacar();
        }
        
        //metodo especifico
        ((Avenger)ironMan).reunirse();
        
        //ejemplo metodo especifico de thanos
        thanos.chasquearDedos();
    }
}
