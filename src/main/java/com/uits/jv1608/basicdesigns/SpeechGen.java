/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uits.jv1608.basicdesigns;

/**
 *
 * @author Serebra
 */
public class SpeechGen {
    public static void main(String[] args) {
        String[] speechP1 = {
            "Дорогие друзья! ",
            "с другой стороны ",
            "равным образом",
            "Не следует, однако, забывать о том, что",
            "Таким образом,",
            "Повседневная практика показывает, что",
            "Значимость этих проблем настолько очевидна, что",
            "Разнообразный и богатый опыт",
            "Задача организации, в особенности же",
            "Соображения высшего порядка, а также"
        };
        
        String[] speechP2 = {
            "реализация намеченных плановых заданий",
            "рамки и место обучения кадров",
            "постоянный количественный рост и сфера нашей активности, сложившаяся структура организации",
            "новая модель",
            "организационной деятельности",
            "дальнейшее развитие различных форм деятельности",
            "постоянное информационно-пропагандистское обеспечение нашей деятельности",
            "укрепления и развития структуры",
            "консультация с широким активом",
            "начало повседневной работы по формированию позиции"
        };
        
        String[] speechP3 = {
            "играет важную роль в формировании",
            "требуют от нас анализа",
            "требуют определения и уточнения",
            "способствует подготовке и реализации",
            "обеспечивает широкому кругу специалистов участие в формировании",
            "позволяет выполнить",
            "важнейшие задания по разработке",
            "в значительной степени обуславливает создание",
            "позволяет оценить значение",
            "представляет собой интересный эксперимент проверки",
            "влечет за собой процесс внедрения и модернизации"
        };
        
        String[] speechP4 = {
            "существующих финансовых и административных условий",
            "дальнейших направлений развитая",
            "системы массового участия",
            "позиций, занимаемых участниками в отношении поставленных задач",
            "новых предложений",
            "направлений прогрессивного развития",
            "системы обучения кадров соответствующей насущным потребностям",
            "соответствующих условий активизации",
            "модели развития",
            "форм воздействия"
        };
        
        int p1 = (int)(Math.random()*9);
        int p2 = (int)(Math.random()*9);
        int p3 = (int)(Math.random()*9);
        int p4 = (int)(Math.random()*9);
        System.out.println(speechP1[p1] + "\n" + speechP2[p2] + "\n" + speechP3[p3] + "\n" + speechP4[p4]);
    }
}
