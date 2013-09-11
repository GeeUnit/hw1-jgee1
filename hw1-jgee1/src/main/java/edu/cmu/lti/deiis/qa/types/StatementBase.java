/* First created by JCasGen Tue Sep 10 22:07:54 EDT 2013 */
package edu.cmu.lti.deiis.qa.types;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;

/**
 * StatementBase is the annotation used to describe a line of text. StatementBase objects contain a
 * finite number of tokens and n-grams.
 * 
 * Updated by JCasGen Tue Sep 10 22:11:21 EDT 2013 XML source:
 * /home/jeff/workspace/11791/hw1-jgee1/src/main/resources/hw1-jgee1-typesystem.xml
 * 
 * @generated
 */
public class StatementBase extends QAAnnotation {
  /**
   * @generated
   * @ordered
   */
  @SuppressWarnings("hiding")
  public final static int typeIndexID = JCasRegistry.register(StatementBase.class);

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
  protected StatementBase() {/* intentionally empty block */
  }

  /**
   * Internal - constructor used by generator
   * 
   * @generated
   */
  public StatementBase(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }

  /** @generated */
  public StatementBase(JCas jcas) {
    super(jcas);
    readObject();
  }

  /** @generated */
  public StatementBase(JCas jcas, int begin, int end) {
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
  // * Feature: tokens

  /**
   * getter for tokens - gets a list of Token annotations for this statement
   * 
   * @generated
   */
  public FSList getTokens() {
    if (StatementBase_Type.featOkTst && ((StatementBase_Type) jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "edu.cmu.lti.deiis.qa.types.StatementBase");
    return (FSList) (jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr,
            ((StatementBase_Type) jcasType).casFeatCode_tokens)));
  }

  /**
   * setter for tokens - sets a list of Token annotations for this statement
   * 
   * @generated
   */
  public void setTokens(FSList v) {
    if (StatementBase_Type.featOkTst && ((StatementBase_Type) jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "edu.cmu.lti.deiis.qa.types.StatementBase");
    jcasType.ll_cas.ll_setRefValue(addr, ((StatementBase_Type) jcasType).casFeatCode_tokens,
            jcasType.ll_cas.ll_getFSRef(v));
  }

  // *--------------*
  // * Feature: unigrams

  /**
   * getter for unigrams - gets a list of unigram annotations for this sentence.
   * 
   * @generated
   */
  public FSList getUnigrams() {
    if (StatementBase_Type.featOkTst && ((StatementBase_Type) jcasType).casFeat_unigrams == null)
      jcasType.jcas.throwFeatMissing("unigrams", "edu.cmu.lti.deiis.qa.types.StatementBase");
    return (FSList) (jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr,
            ((StatementBase_Type) jcasType).casFeatCode_unigrams)));
  }

  /**
   * setter for unigrams - sets a list of unigram annotations for this sentence.
   * 
   * @generated
   */
  public void setUnigrams(FSList v) {
    if (StatementBase_Type.featOkTst && ((StatementBase_Type) jcasType).casFeat_unigrams == null)
      jcasType.jcas.throwFeatMissing("unigrams", "edu.cmu.lti.deiis.qa.types.StatementBase");
    jcasType.ll_cas.ll_setRefValue(addr, ((StatementBase_Type) jcasType).casFeatCode_unigrams,
            jcasType.ll_cas.ll_getFSRef(v));
  }

  // *--------------*
  // * Feature: bigrams

  /**
   * getter for bigrams - gets a list of bigram annotations for this sentence.
   * 
   * @generated
   */
  public FSList getBigrams() {
    if (StatementBase_Type.featOkTst && ((StatementBase_Type) jcasType).casFeat_bigrams == null)
      jcasType.jcas.throwFeatMissing("bigrams", "edu.cmu.lti.deiis.qa.types.StatementBase");
    return (FSList) (jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr,
            ((StatementBase_Type) jcasType).casFeatCode_bigrams)));
  }

  /**
   * setter for bigrams - sets a list of bigram annotations for this sentence.
   * 
   * @generated
   */
  public void setBigrams(FSList v) {
    if (StatementBase_Type.featOkTst && ((StatementBase_Type) jcasType).casFeat_bigrams == null)
      jcasType.jcas.throwFeatMissing("bigrams", "edu.cmu.lti.deiis.qa.types.StatementBase");
    jcasType.ll_cas.ll_setRefValue(addr, ((StatementBase_Type) jcasType).casFeatCode_bigrams,
            jcasType.ll_cas.ll_getFSRef(v));
  }

  // *--------------*
  // * Feature: trigrams

  /**
   * getter for trigrams - gets a list of trigram annotations for this statement.
   * 
   * @generated
   */
  public FSList getTrigrams() {
    if (StatementBase_Type.featOkTst && ((StatementBase_Type) jcasType).casFeat_trigrams == null)
      jcasType.jcas.throwFeatMissing("trigrams", "edu.cmu.lti.deiis.qa.types.StatementBase");
    return (FSList) (jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr,
            ((StatementBase_Type) jcasType).casFeatCode_trigrams)));
  }

  /**
   * setter for trigrams - sets a list of trigram annotations for this statement.
   * 
   * @generated
   */
  public void setTrigrams(FSList v) {
    if (StatementBase_Type.featOkTst && ((StatementBase_Type) jcasType).casFeat_trigrams == null)
      jcasType.jcas.throwFeatMissing("trigrams", "edu.cmu.lti.deiis.qa.types.StatementBase");
    jcasType.ll_cas.ll_setRefValue(addr, ((StatementBase_Type) jcasType).casFeatCode_trigrams,
            jcasType.ll_cas.ll_getFSRef(v));
  }
}
