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

/**
 * StatementBase is the annotation used to describe a line of text. StatementBase objects contain a
 * finite number of tokens and n-grams.
 * 
 * Updated by JCasGen Tue Sep 10 22:11:21 EDT 2013
 * 
 * @generated
 */
public class StatementBase_Type extends QAAnnotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {
    return fsGenerator;
  }

  /** @generated */
  private final FSGenerator fsGenerator = new FSGenerator() {
    public FeatureStructure createFS(int addr, CASImpl cas) {
      if (StatementBase_Type.this.useExistingInstance) {
        // Return eq fs instance if already created
        FeatureStructure fs = StatementBase_Type.this.jcas.getJfsFromCaddr(addr);
        if (null == fs) {
          fs = new StatementBase(addr, StatementBase_Type.this);
          StatementBase_Type.this.jcas.putJfsFromCaddr(addr, fs);
          return fs;
        }
        return fs;
      } else
        return new StatementBase(addr, StatementBase_Type.this);
    }
  };

  /** @generated */
  @SuppressWarnings("hiding")
  public final static int typeIndexID = StatementBase.typeIndexID;

  /**
   * @generated
   * @modifiable
   */
  @SuppressWarnings("hiding")
  public final static boolean featOkTst = JCasRegistry
          .getFeatOkTst("edu.cmu.lti.deiis.qa.types.StatementBase");

  /** @generated */
  final Feature casFeat_tokens;

  /** @generated */
  final int casFeatCode_tokens;

  /** @generated */
  public int getTokens(int addr) {
    if (featOkTst && casFeat_tokens == null)
      jcas.throwFeatMissing("tokens", "edu.cmu.lti.deiis.qa.types.StatementBase");
    return ll_cas.ll_getRefValue(addr, casFeatCode_tokens);
  }

  /** @generated */
  public void setTokens(int addr, int v) {
    if (featOkTst && casFeat_tokens == null)
      jcas.throwFeatMissing("tokens", "edu.cmu.lti.deiis.qa.types.StatementBase");
    ll_cas.ll_setRefValue(addr, casFeatCode_tokens, v);
  }

  /** @generated */
  final Feature casFeat_unigrams;

  /** @generated */
  final int casFeatCode_unigrams;

  /** @generated */
  public int getUnigrams(int addr) {
    if (featOkTst && casFeat_unigrams == null)
      jcas.throwFeatMissing("unigrams", "edu.cmu.lti.deiis.qa.types.StatementBase");
    return ll_cas.ll_getRefValue(addr, casFeatCode_unigrams);
  }

  /** @generated */
  public void setUnigrams(int addr, int v) {
    if (featOkTst && casFeat_unigrams == null)
      jcas.throwFeatMissing("unigrams", "edu.cmu.lti.deiis.qa.types.StatementBase");
    ll_cas.ll_setRefValue(addr, casFeatCode_unigrams, v);
  }

  /** @generated */
  final Feature casFeat_bigrams;

  /** @generated */
  final int casFeatCode_bigrams;

  /** @generated */
  public int getBigrams(int addr) {
    if (featOkTst && casFeat_bigrams == null)
      jcas.throwFeatMissing("bigrams", "edu.cmu.lti.deiis.qa.types.StatementBase");
    return ll_cas.ll_getRefValue(addr, casFeatCode_bigrams);
  }

  /** @generated */
  public void setBigrams(int addr, int v) {
    if (featOkTst && casFeat_bigrams == null)
      jcas.throwFeatMissing("bigrams", "edu.cmu.lti.deiis.qa.types.StatementBase");
    ll_cas.ll_setRefValue(addr, casFeatCode_bigrams, v);
  }

  /** @generated */
  final Feature casFeat_trigrams;

  /** @generated */
  final int casFeatCode_trigrams;

  /** @generated */
  public int getTrigrams(int addr) {
    if (featOkTst && casFeat_trigrams == null)
      jcas.throwFeatMissing("trigrams", "edu.cmu.lti.deiis.qa.types.StatementBase");
    return ll_cas.ll_getRefValue(addr, casFeatCode_trigrams);
  }

  /** @generated */
  public void setTrigrams(int addr, int v) {
    if (featOkTst && casFeat_trigrams == null)
      jcas.throwFeatMissing("trigrams", "edu.cmu.lti.deiis.qa.types.StatementBase");
    ll_cas.ll_setRefValue(addr, casFeatCode_trigrams, v);
  }

  /**
   * initialize variables to correspond with Cas Type and Features
   * 
   * @generated
   */
  public StatementBase_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());

    casFeat_tokens = jcas.getRequiredFeatureDE(casType, "tokens", "uima.cas.FSList", featOkTst);
    casFeatCode_tokens = (null == casFeat_tokens) ? JCas.INVALID_FEATURE_CODE
            : ((FeatureImpl) casFeat_tokens).getCode();

    casFeat_unigrams = jcas.getRequiredFeatureDE(casType, "unigrams", "uima.cas.FSList", featOkTst);
    casFeatCode_unigrams = (null == casFeat_unigrams) ? JCas.INVALID_FEATURE_CODE
            : ((FeatureImpl) casFeat_unigrams).getCode();

    casFeat_bigrams = jcas.getRequiredFeatureDE(casType, "bigrams", "uima.cas.FSList", featOkTst);
    casFeatCode_bigrams = (null == casFeat_bigrams) ? JCas.INVALID_FEATURE_CODE
            : ((FeatureImpl) casFeat_bigrams).getCode();

    casFeat_trigrams = jcas.getRequiredFeatureDE(casType, "trigrams", "uima.cas.FSList", featOkTst);
    casFeatCode_trigrams = (null == casFeat_trigrams) ? JCas.INVALID_FEATURE_CODE
            : ((FeatureImpl) casFeat_trigrams).getCode();

  }
}
