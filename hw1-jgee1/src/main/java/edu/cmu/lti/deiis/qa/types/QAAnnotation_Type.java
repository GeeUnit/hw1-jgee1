/* First created by JCasGen Tue Sep 10 22:07:54 EDT 2013 */
package edu.cmu.lti.deiis.qa.types;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/**
 * QAAnnotator is the base annotation for this system. It extends UIMA’s built-in Annotation class
 * with additional fields, namely casProcessorID and confidence. Updated by JCasGen Tue Sep 10
 * 22:11:21 EDT 2013
 * 
 * @generated
 */
public class QAAnnotation_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {
    return fsGenerator;
  }

  /** @generated */
  private final FSGenerator fsGenerator = new FSGenerator() {
    public FeatureStructure createFS(int addr, CASImpl cas) {
      if (QAAnnotation_Type.this.useExistingInstance) {
        // Return eq fs instance if already created
        FeatureStructure fs = QAAnnotation_Type.this.jcas.getJfsFromCaddr(addr);
        if (null == fs) {
          fs = new QAAnnotation(addr, QAAnnotation_Type.this);
          QAAnnotation_Type.this.jcas.putJfsFromCaddr(addr, fs);
          return fs;
        }
        return fs;
      } else
        return new QAAnnotation(addr, QAAnnotation_Type.this);
    }
  };

  /** @generated */
  @SuppressWarnings("hiding")
  public final static int typeIndexID = QAAnnotation.typeIndexID;

  /**
   * @generated
   * @modifiable
   */
  @SuppressWarnings("hiding")
  public final static boolean featOkTst = JCasRegistry
          .getFeatOkTst("edu.cmu.lti.deiis.qa.types.QAAnnotation");

  /** @generated */
  final Feature casFeat_confidence;

  /** @generated */
  final int casFeatCode_confidence;

  /** @generated */
  public double getConfidence(int addr) {
    if (featOkTst && casFeat_confidence == null)
      jcas.throwFeatMissing("confidence", "edu.cmu.lti.deiis.qa.types.QAAnnotation");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_confidence);
  }

  /** @generated */
  public void setConfidence(int addr, double v) {
    if (featOkTst && casFeat_confidence == null)
      jcas.throwFeatMissing("confidence", "edu.cmu.lti.deiis.qa.types.QAAnnotation");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_confidence, v);
  }

  /** @generated */
  final Feature casFeat_casProcessorID;

  /** @generated */
  final int casFeatCode_casProcessorID;

  /** @generated */
  public String getCasProcessorID(int addr) {
    if (featOkTst && casFeat_casProcessorID == null)
      jcas.throwFeatMissing("casProcessorID", "edu.cmu.lti.deiis.qa.types.QAAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_casProcessorID);
  }

  /** @generated */
  public void setCasProcessorID(int addr, String v) {
    if (featOkTst && casFeat_casProcessorID == null)
      jcas.throwFeatMissing("casProcessorID", "edu.cmu.lti.deiis.qa.types.QAAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_casProcessorID, v);
  }

  /**
   * initialize variables to correspond with Cas Type and Features
   * 
   * @generated
   */
  public QAAnnotation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());

    casFeat_confidence = jcas.getRequiredFeatureDE(casType, "confidence", "uima.cas.Double",
            featOkTst);
    casFeatCode_confidence = (null == casFeat_confidence) ? JCas.INVALID_FEATURE_CODE
            : ((FeatureImpl) casFeat_confidence).getCode();

    casFeat_casProcessorID = jcas.getRequiredFeatureDE(casType, "casProcessorID",
            "uima.cas.String", featOkTst);
    casFeatCode_casProcessorID = (null == casFeat_casProcessorID) ? JCas.INVALID_FEATURE_CODE
            : ((FeatureImpl) casFeat_casProcessorID).getCode();

  }
}
