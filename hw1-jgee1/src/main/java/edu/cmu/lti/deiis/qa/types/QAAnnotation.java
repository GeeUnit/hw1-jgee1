/* First created by JCasGen Tue Sep 10 22:07:54 EDT 2013 */
package edu.cmu.lti.deiis.qa.types;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;

/**
 * QAAnnotator is the base annotation for this system. It extends UIMA’s built-in Annotation class
 * with additional fields, namely casProcessorID and confidence. Updated by JCasGen Tue Sep 10
 * 22:11:21 EDT 2013 XML source:
 * /home/jeff/workspace/11791/hw1-jgee1/src/main/resources/hw1-jgee1-typesystem.xml
 * 
 * @generated
 */
public class QAAnnotation extends Annotation {
  /**
   * @generated
   * @ordered
   */
  @SuppressWarnings("hiding")
  public final static int typeIndexID = JCasRegistry.register(QAAnnotation.class);

  /**
   * @generated
   * @ordered
   */
  @SuppressWarnings("hiding")
  public final static int type = typeIndexID;

  /** @generated */
  @Override
  public int getTypeIndexID() {
    return typeIndexID;
  }

  /**
   * Never called. Disable default constructor
   * 
   * @generated
   */
  protected QAAnnotation() {/* intentionally empty block */
  }

  /**
   * Internal - constructor used by generator
   * 
   * @generated
   */
  public QAAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }

  /** @generated */
  public QAAnnotation(JCas jcas) {
    super(jcas);
    readObject();
  }

  /** @generated */
  public QAAnnotation(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }

  /**
   * <!-- begin-user-doc --> Write your own initialization here <!-- end-user-doc -->
   * 
   * @generated modifiable
   */
  private void readObject() {/* default - does nothing empty block */
  }

  // *--------------*
  // * Feature: confidence

  /**
   * getter for confidence - gets the assigned confidence for this QAAnnotation
   * 
   * @generated
   */
  public double getConfidence() {
    if (QAAnnotation_Type.featOkTst && ((QAAnnotation_Type) jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "edu.cmu.lti.deiis.qa.types.QAAnnotation");
    return jcasType.ll_cas.ll_getDoubleValue(addr,
            ((QAAnnotation_Type) jcasType).casFeatCode_confidence);
  }

  /**
   * setter for confidence - sets the assigned confidence for this QAAnnotation
   * 
   * @generated
   */
  public void setConfidence(double v) {
    if (QAAnnotation_Type.featOkTst && ((QAAnnotation_Type) jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "edu.cmu.lti.deiis.qa.types.QAAnnotation");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((QAAnnotation_Type) jcasType).casFeatCode_confidence,
            v);
  }

  // *--------------*
  // * Feature: casProcessorID

  /**
   * getter for casProcessorID - gets the Annotator/Processor that produced this Annotation.
   * 
   * @generated
   */
  public String getCasProcessorID() {
    if (QAAnnotation_Type.featOkTst
            && ((QAAnnotation_Type) jcasType).casFeat_casProcessorID == null)
      jcasType.jcas.throwFeatMissing("casProcessorID", "edu.cmu.lti.deiis.qa.types.QAAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr,
            ((QAAnnotation_Type) jcasType).casFeatCode_casProcessorID);
  }

  /**
   * setter for casProcessorID - sets the Annotator/Processor that produced this Annotation.
   * 
   * @generated
   */
  public void setCasProcessorID(String v) {
    if (QAAnnotation_Type.featOkTst
            && ((QAAnnotation_Type) jcasType).casFeat_casProcessorID == null)
      jcasType.jcas.throwFeatMissing("casProcessorID", "edu.cmu.lti.deiis.qa.types.QAAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr,
            ((QAAnnotation_Type) jcasType).casFeatCode_casProcessorID, v);
  }
}
