package com.biblio.fr.biblio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class BiblioApplication {

	public static void main(String[] args) {
		SpringApplication.run(BiblioApplication.class, args);
	}

}

/*
 * @Entity, qui permet à hibernate/JPA de les considérer comme des ORM (Object
 * Relational Mapping) devant transporter des données entre l'application et la
 * base de données ;
 * 
 * @Table, qui permet de mapper cet ORM sur une table physique en base de
 * données ;
 * 
 * @Id, qui permet de consacrer un attribut de la classe comme étant sa clef
 * primaire ; et @GeneratedValue pour la stratégie de génération des valeurs de
 * cette clef primaire ;
 * 
 * @Column, pour le mapping d'un attribut de classe à une colonne de table en
 * base de données ;
 * 
 * @AssociationOverrides, @Embeddable et @EmbeddedId, pour la gestion de clef
 * primaire composée et de migration de clef étrangère ;
 * 
 * @ManyToOne, @OneToMany et @JoinColumn, pour la gestion des associations n-1,
 * 1-n entre deux entités.
 */