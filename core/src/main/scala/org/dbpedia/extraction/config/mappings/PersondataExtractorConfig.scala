package org.dbpedia.extraction.config.mappings


object PersondataExtractorConfig
{
  // The French template is not used anymore. See http://fr.wikipedia.org/wiki/Wikipédia:Sondage/Limitation_du_modèle_Métadonnées_personne

  val supportedLanguages = Set("en", "de", "ja")
  val persondataTemplates = Map("en" -> "persondata", "de" -> "personendaten", "ja" -> "persondata")
  val name = Map("en" -> "NAME", "de" -> "NAME", "ja" -> "NAME")
  val alternativeNames = Map("en" -> "ALTERNATIVE NAMES", "de" -> "ALTERNATIVNAMEN", "ja" -> "ALTERNATIVE NAMES")
  val description = Map("en" -> "SHORT DESCRIPTION", "de" -> "KURZBESCHREIBUNG", "ja" -> "SHORT DESCRIPTION")
  val birthDate = Map("en" -> "DATE OF BIRTH", "de" -> "GEBURTSDATUM", "ja" -> "DATE OF BIRTH")
  val birthPlace = Map("en" -> "PLACE OF BIRTH", "de" -> "GEBURTSORT", "ja" -> "PLACE OF BIRTH")
  val deathDate = Map("en" -> "DATE OF DEATH", "de" -> "STERBEDATUM", "ja" -> "DATE OF DEATH")
  val deathPlace = Map("en" -> "PLACE OF DEATH", "de" -> "STERBEORT", "ja" -> "PLACE OF DEATH")
}