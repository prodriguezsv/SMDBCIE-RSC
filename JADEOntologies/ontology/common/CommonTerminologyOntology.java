// file: CommonTerminologyOntology.java generated by ontology bean generator.  DO NOT EDIT, UNLESS YOU ARE REALLY SURE WHAT YOU ARE DOING!
package ontology.common;

import jade.content.onto.*;
import jade.content.schema.*;

/** file: CommonTerminologyOntology.java
 * @author ontology bean generator
 * @version 2009/09/30, 12:55:43
 */
public class CommonTerminologyOntology extends jade.content.onto.Ontology  {

  private static final long serialVersionUID = 3978892154560758766L;

  //NAME
  public static final String ONTOLOGY_NAME = "CommonTerminology";
  // The singleton instance of this ontology
  private static Ontology theInstance = new CommonTerminologyOntology();
  public static Ontology getInstance() {
     return theInstance;
  }


   // VOCABULARY
    public static final String DESCRIBEDBY_SCORE="score";
    public static final String DESCRIBEDBY_ATTRIBUTE="attribute";
    public static final String DESCRIBEDBY="DescribedBy";
    public static final String DESCRIBES_SCORE="score";
    public static final String DESCRIBES_ATTRIBUTE="attribute";
    public static final String DESCRIBES="Describes";
    public static final String OWNS_DESCRIPTIVEELEMENT="descriptiveElement";
    public static final String OWNS_ATTRIBUTE="attribute";
    public static final String OWNS="Owns";
    public static final String APLIESTO_DESCRIPTIVEELEMENT="descriptiveElement";
    public static final String APLIESTO_ATTRIBUTE="attribute";
    public static final String APLIESTO="ApliesTo";
    public static final String STATE_DESCRIBES="describes";
    public static final String STATE="State";
    public static final String DESCRIPTOR_STRUCTURE="structure";
    public static final String DESCRIPTOR_SCORE="score";
    public static final String DESCRIPTOR_ATTRIBUTE="attribute";
    public static final String DESCRIPTOR="Descriptor";
    public static final String ENVIRONMENTALCATEGORY_OWNS="owns";
    public static final String ENVIRONMENTALCATEGORY="EnvironmentalCategory";
    public static final String STRUCTURE_OWNS="owns";
    public static final String STRUCTURE="Structure";
    public static final String ATTRIBUTE_DESCRIBEDBY="describedBy";
    public static final String ATTRIBUTE_APLIESTO="apliesTo";
    public static final String ATTRIBUTE="Attribute";
    public static final String DESCRIPTION_DESCRIPTORS="descriptors";
    public static final String DESCRIPTION="Description";
    public static final String SVHEURISTICDESCRIPTOR="SVHeuristicDescriptor";
    public static final String RVHEURISTICDESCRIPTOR="RVHeuristicDescriptor";
    public static final String RVCHARACTERDESCRIPTOR="RVCharacterDescriptor";
    public static final String HEURISTICDESCRIPTOR="HeuristicDescriptor";
    public static final String QUANTITATIVECHARACTERDESCRIPTOR="QuantitativeCharacterDescriptor";
    public static final String SVCHARACTERDESCRIPTOR="SVCharacterDescriptor";
    public static final String MSHEURISTICDESCRIPTOR="MSHeuristicDescriptor";
    public static final String QUANTITATIVEHEURISTICDESCRIPTOR="QuantitativeHeuristicDescriptor";
    public static final String QUALITATIVEHEURISTICDESCRIPTOR="QualitativeHeuristicDescriptor";
    public static final String SSHEURISTICDESCRIPTOR="SSHeuristicDescriptor";
    public static final String QUALITATIVECHARACTERDESCRIPTOR="QualitativeCharacterDescriptor";
    public static final String CHARACTERDESCRIPTOR="CharacterDescriptor";
    public static final String MSCHARACTERDESCRIPTOR="MSCharacterDescriptor";
    public static final String SSCHARACTERDESCRIPTOR="SSCharacterDescriptor";
    public static final String DEFINEDTERM_DEFINITION="definition";
    public static final String DEFINEDTERM_TERM="term";
    public static final String DEFINEDTERM="DefinedTerm";
    public static final String RANGEVALUE_LOWERBOUND="lowerBound";
    public static final String RANGEVALUE_UPPERBOUND="upperBound";
    public static final String RANGEVALUE="RangeValue";
    public static final String SINGLEVALUE_VALUE="value";
    public static final String SINGLEVALUE="SingleValue";
    public static final String VALUE_MEASURINGUNIT="measuringUnit";
    public static final String VALUE_DESCRIBES="describes";
    public static final String VALUE="Value";

  /**
   * Constructor
  */
  private CommonTerminologyOntology(){ 
    super(ONTOLOGY_NAME, BasicOntology.getInstance());
    try { 

    // adding Concept(s)
    ConceptSchema valueSchema = new ConceptSchema(VALUE);
    add(valueSchema, ontology.common.Value.class);
    ConceptSchema singleValueSchema = new ConceptSchema(SINGLEVALUE);
    add(singleValueSchema, ontology.common.SingleValue.class);
    ConceptSchema rangeValueSchema = new ConceptSchema(RANGEVALUE);
    add(rangeValueSchema, ontology.common.RangeValue.class);
    ConceptSchema definedTermSchema = new ConceptSchema(DEFINEDTERM);
    add(definedTermSchema, ontology.common.DefinedTerm.class);
    ConceptSchema ssCharacterDescriptorSchema = new ConceptSchema(SSCHARACTERDESCRIPTOR);
    add(ssCharacterDescriptorSchema, ontology.common.SSCharacterDescriptor.class);
    ConceptSchema msCharacterDescriptorSchema = new ConceptSchema(MSCHARACTERDESCRIPTOR);
    add(msCharacterDescriptorSchema, ontology.common.MSCharacterDescriptor.class);
    ConceptSchema characterDescriptorSchema = new ConceptSchema(CHARACTERDESCRIPTOR);
    add(characterDescriptorSchema, ontology.common.CharacterDescriptor.class);
    ConceptSchema qualitativeCharacterDescriptorSchema = new ConceptSchema(QUALITATIVECHARACTERDESCRIPTOR);
    add(qualitativeCharacterDescriptorSchema, ontology.common.QualitativeCharacterDescriptor.class);
    ConceptSchema ssHeuristicDescriptorSchema = new ConceptSchema(SSHEURISTICDESCRIPTOR);
    add(ssHeuristicDescriptorSchema, ontology.common.SSHeuristicDescriptor.class);
    ConceptSchema qualitativeHeuristicDescriptorSchema = new ConceptSchema(QUALITATIVEHEURISTICDESCRIPTOR);
    add(qualitativeHeuristicDescriptorSchema, ontology.common.QualitativeHeuristicDescriptor.class);
    ConceptSchema quantitativeHeuristicDescriptorSchema = new ConceptSchema(QUANTITATIVEHEURISTICDESCRIPTOR);
    add(quantitativeHeuristicDescriptorSchema, ontology.common.QuantitativeHeuristicDescriptor.class);
    ConceptSchema msHeuristicDescriptorSchema = new ConceptSchema(MSHEURISTICDESCRIPTOR);
    add(msHeuristicDescriptorSchema, ontology.common.MSHeuristicDescriptor.class);
    ConceptSchema svCharacterDescriptorSchema = new ConceptSchema(SVCHARACTERDESCRIPTOR);
    add(svCharacterDescriptorSchema, ontology.common.SVCharacterDescriptor.class);
    ConceptSchema quantitativeCharacterDescriptorSchema = new ConceptSchema(QUANTITATIVECHARACTERDESCRIPTOR);
    add(quantitativeCharacterDescriptorSchema, ontology.common.QuantitativeCharacterDescriptor.class);
    ConceptSchema heuristicDescriptorSchema = new ConceptSchema(HEURISTICDESCRIPTOR);
    add(heuristicDescriptorSchema, ontology.common.HeuristicDescriptor.class);
    ConceptSchema rvCharacterDescriptorSchema = new ConceptSchema(RVCHARACTERDESCRIPTOR);
    add(rvCharacterDescriptorSchema, ontology.common.RVCharacterDescriptor.class);
    ConceptSchema rvHeuristicDescriptorSchema = new ConceptSchema(RVHEURISTICDESCRIPTOR);
    add(rvHeuristicDescriptorSchema, ontology.common.RVHeuristicDescriptor.class);
    ConceptSchema svHeuristicDescriptorSchema = new ConceptSchema(SVHEURISTICDESCRIPTOR);
    add(svHeuristicDescriptorSchema, ontology.common.SVHeuristicDescriptor.class);
    ConceptSchema descriptionSchema = new ConceptSchema(DESCRIPTION);
    add(descriptionSchema, ontology.common.Description.class);
    ConceptSchema attributeSchema = new ConceptSchema(ATTRIBUTE);
    add(attributeSchema, ontology.common.Attribute.class);
    ConceptSchema structureSchema = new ConceptSchema(STRUCTURE);
    add(structureSchema, ontology.common.Structure.class);
    ConceptSchema environmentalCategorySchema = new ConceptSchema(ENVIRONMENTALCATEGORY);
    add(environmentalCategorySchema, ontology.common.EnvironmentalCategory.class);
    ConceptSchema descriptorSchema = new ConceptSchema(DESCRIPTOR);
    add(descriptorSchema, ontology.common.Descriptor.class);
    ConceptSchema stateSchema = new ConceptSchema(STATE);
    add(stateSchema, ontology.common.State.class);

    // adding AgentAction(s)

    // adding AID(s)

    // adding Predicate(s)
    PredicateSchema apliesToSchema = new PredicateSchema(APLIESTO);
    add(apliesToSchema, ontology.common.ApliesTo.class);
    PredicateSchema ownsSchema = new PredicateSchema(OWNS);
    add(ownsSchema, ontology.common.Owns.class);
    PredicateSchema describesSchema = new PredicateSchema(DESCRIBES);
    add(describesSchema, ontology.common.Describes.class);
    PredicateSchema describedBySchema = new PredicateSchema(DESCRIBEDBY);
    add(describedBySchema, ontology.common.DescribedBy.class);


    // adding fields
    valueSchema.add(VALUE_DESCRIBES, attributeSchema, 1, ObjectSchema.UNLIMITED);
    valueSchema.add(VALUE_MEASURINGUNIT, (TermSchema)getSchema(BasicOntology.STRING), ObjectSchema.MANDATORY);
    singleValueSchema.add(SINGLEVALUE_VALUE, (TermSchema)getSchema(BasicOntology.FLOAT), ObjectSchema.MANDATORY);
    rangeValueSchema.add(RANGEVALUE_UPPERBOUND, (TermSchema)getSchema(BasicOntology.FLOAT), ObjectSchema.MANDATORY);
    rangeValueSchema.add(RANGEVALUE_LOWERBOUND, (TermSchema)getSchema(BasicOntology.FLOAT), ObjectSchema.MANDATORY);
    definedTermSchema.add(DEFINEDTERM_TERM, (TermSchema)getSchema(BasicOntology.STRING), ObjectSchema.MANDATORY);
    definedTermSchema.add(DEFINEDTERM_DEFINITION, (TermSchema)getSchema(BasicOntology.STRING), ObjectSchema.OPTIONAL);
    descriptionSchema.add(DESCRIPTION_DESCRIPTORS, descriptorSchema, 1, ObjectSchema.UNLIMITED);
    attributeSchema.add(ATTRIBUTE_APLIESTO, new ConceptSchema("Concept"), 1, ObjectSchema.UNLIMITED);
    attributeSchema.add(ATTRIBUTE_DESCRIBEDBY, new ConceptSchema("Concept"), 0, ObjectSchema.UNLIMITED);
    structureSchema.add(STRUCTURE_OWNS, attributeSchema, 1, ObjectSchema.UNLIMITED);
    environmentalCategorySchema.add(ENVIRONMENTALCATEGORY_OWNS, attributeSchema, 1, ObjectSchema.UNLIMITED);
    descriptorSchema.add(DESCRIPTOR_ATTRIBUTE, attributeSchema, ObjectSchema.MANDATORY);
    descriptorSchema.add(DESCRIPTOR_SCORE, new ConceptSchema("Concept"), 1, ObjectSchema.UNLIMITED);
    descriptorSchema.add(DESCRIPTOR_STRUCTURE, new ConceptSchema("Concept"), ObjectSchema.MANDATORY);
    stateSchema.add(STATE_DESCRIBES, attributeSchema, 1, ObjectSchema.UNLIMITED);
    apliesToSchema.add(APLIESTO_ATTRIBUTE, attributeSchema, ObjectSchema.MANDATORY);
    apliesToSchema.add(APLIESTO_DESCRIPTIVEELEMENT, new ConceptSchema("Concept"), ObjectSchema.OPTIONAL);
    ownsSchema.add(OWNS_ATTRIBUTE, attributeSchema, ObjectSchema.MANDATORY);
    ownsSchema.add(OWNS_DESCRIPTIVEELEMENT, new ConceptSchema("Concept"), ObjectSchema.OPTIONAL);
    describesSchema.add(DESCRIBES_ATTRIBUTE, attributeSchema, ObjectSchema.MANDATORY);
    describesSchema.add(DESCRIBES_SCORE, new ConceptSchema("Concept"), 1, ObjectSchema.UNLIMITED);
    describedBySchema.add(DESCRIBEDBY_ATTRIBUTE, attributeSchema, ObjectSchema.MANDATORY);
    describedBySchema.add(DESCRIBEDBY_SCORE, new ConceptSchema("Concept"), 1, ObjectSchema.UNLIMITED);

    // adding name mappings

    // adding inheritance
    singleValueSchema.addSuperSchema(valueSchema);
    rangeValueSchema.addSuperSchema(valueSchema);
    ssCharacterDescriptorSchema.addSuperSchema(qualitativeCharacterDescriptorSchema);
    msCharacterDescriptorSchema.addSuperSchema(qualitativeCharacterDescriptorSchema);
    characterDescriptorSchema.addSuperSchema(descriptorSchema);
    qualitativeCharacterDescriptorSchema.addSuperSchema(characterDescriptorSchema);
    ssHeuristicDescriptorSchema.addSuperSchema(qualitativeHeuristicDescriptorSchema);
    qualitativeHeuristicDescriptorSchema.addSuperSchema(heuristicDescriptorSchema);
    quantitativeHeuristicDescriptorSchema.addSuperSchema(heuristicDescriptorSchema);
    msHeuristicDescriptorSchema.addSuperSchema(qualitativeHeuristicDescriptorSchema);
    svCharacterDescriptorSchema.addSuperSchema(quantitativeCharacterDescriptorSchema);
    quantitativeCharacterDescriptorSchema.addSuperSchema(characterDescriptorSchema);
    heuristicDescriptorSchema.addSuperSchema(descriptorSchema);
    rvCharacterDescriptorSchema.addSuperSchema(quantitativeCharacterDescriptorSchema);
    rvHeuristicDescriptorSchema.addSuperSchema(quantitativeHeuristicDescriptorSchema);
    svHeuristicDescriptorSchema.addSuperSchema(quantitativeHeuristicDescriptorSchema);
    attributeSchema.addSuperSchema(definedTermSchema);
    structureSchema.addSuperSchema(definedTermSchema);
    environmentalCategorySchema.addSuperSchema(definedTermSchema);
    stateSchema.addSuperSchema(definedTermSchema);

   }catch (java.lang.Exception e) {e.printStackTrace();}
  }
}
