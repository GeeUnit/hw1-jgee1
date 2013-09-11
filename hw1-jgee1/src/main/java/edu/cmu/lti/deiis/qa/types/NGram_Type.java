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
 * N-grams are N-consecutive token combinations contained within statements. Updated by JCasGen Tue
 * Sep 10 22:11:21 EDT 2013
 * 
 * @generated
 */
public class NGram_Type extends QAAnnotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {
    return fsGenerator;
  }

  /** @generated */
  private final FSGenerator fsGenerator = new FSGenerator() {
    public FeatureStructure createFS(int addr, CASImpl cas) {
      if (NGram_Type.this.useExistingInstance) {
        // Return eq fs instance if already created
        FeatureStructure fs = NGram_Type.this.jcas.getJfsFromCaddr(addr);
        if (null == fs) {
          fs = new NGram(addr, NGram_Type.this);
          NGram_Type.this.jcas.putJfsFromCaddr(addr, fs);
          return fs;
        }
        return fs;
      } else
        return new NGram(addr, NGram_Type.this);
    }
  };

  /** @generated */
  @SuppressWarnings("hiding")
  public final static int typeIndexID = NGram.typeIndexID;

  /**
   * @generated
   * @modifiable
   */
  @SuppressWarnings("hiding")
  public final static boolean featOkTst = JCasRegistry
          .getFeatOkTst("edu.cmu.lti.deiis.qa.types.NGram");

  /** @generated */
  final Feature casFeat_tokens;

  /** @generated */
  final int casFeatCode_tokens;

  /** @generated */
  public int getTokens(int addr) {
    if (featOkTst && casFeat_tokens == null)
      jcas.throwFeatMissing("tokens", "edu.cmu.lti.deiis.qa.types.NGram");
    return ll_cas.ll_getRefValue(addr, casFeatCode_tokens);
  }

  /** @generated */
  public void setTokens(int addr, int v) {
    if (featOkTst && casFeat_tokens == null)
      jcas.throwFeatMissing("tokens", "edu.cmu.lti.deiis.qa.types.NGram");
    ll_cas.ll_setRefValue(addr, casFeatCode_tokens, v);
  }

  /** @generated */
  public int getTokens(int addr, int i) {
    if (featOkTst && casFeat_tokens == null)
      jcas.throwFeatMissing("tokens", "edu.cmu.lti.deiis.qa.types.NGram");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_tokens), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_tokens), i);
    return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_tokens), i);
  }

  /** @generated */
  public void setTokens(int addr, int i, int v) {
    if (featOkTst && casFeat_tokens == null)
      jcas.throwFeatMissing("tokens", "edu.cmu.lti.deiis.qa.types.NGram");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_tokens), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_tokens), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_tokens), i, v);
  }

  /**
   * initialize variables to correspond with Cas Type and Features
   * 
   * @generated
   */
  public NGram_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());

    casFeat_tokens = jcas.getRequiredFeatureDE(casType, "tokens", "uima.cas.FSArray", featOkTst);
    casFeatCode_tokens = (null == casFeat_tokens) ? JCas.INVALID_FEATURE_CODE
            : ((FeatureImpl) casFeat_tokens).getCode();

  }
}
