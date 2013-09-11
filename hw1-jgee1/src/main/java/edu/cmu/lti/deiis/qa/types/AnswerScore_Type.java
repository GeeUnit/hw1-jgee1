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
 * score given by a scoring mechanism for a specific question-answer pair. Updated by JCasGen Tue
 * Sep 10 22:11:21 EDT 2013
 * 
 * @generated
 */
public class AnswerScore_Type extends QAAnnotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {
    return fsGenerator;
  }

  /** @generated */
  private final FSGenerator fsGenerator = new FSGenerator() {
    public FeatureStructure createFS(int addr, CASImpl cas) {
      if (AnswerScore_Type.this.useExistingInstance) {
        // Return eq fs instance if already created
        FeatureStructure fs = AnswerScore_Type.this.jcas.getJfsFromCaddr(addr);
        if (null == fs) {
          fs = new AnswerScore(addr, AnswerScore_Type.this);
          AnswerScore_Type.this.jcas.putJfsFromCaddr(addr, fs);
          return fs;
        }
        return fs;
      } else
        return new AnswerScore(addr, AnswerScore_Type.this);
    }
  };

  /** @generated */
  @SuppressWarnings("hiding")
  public final static int typeIndexID = AnswerScore.typeIndexID;

  /**
   * @generated
   * @modifiable
   */
  @SuppressWarnings("hiding")
  public final static boolean featOkTst = JCasRegistry
          .getFeatOkTst("edu.cmu.lti.deiis.qa.types.AnswerScore");

  /** @generated */
  final Feature casFeat_answer;

  /** @generated */
  final int casFeatCode_answer;

  /** @generated */
  public int getAnswer(int addr) {
    if (featOkTst && casFeat_answer == null)
      jcas.throwFeatMissing("answer", "edu.cmu.lti.deiis.qa.types.AnswerScore");
    return ll_cas.ll_getRefValue(addr, casFeatCode_answer);
  }

  /** @generated */
  public void setAnswer(int addr, int v) {
    if (featOkTst && casFeat_answer == null)
      jcas.throwFeatMissing("answer", "edu.cmu.lti.deiis.qa.types.AnswerScore");
    ll_cas.ll_setRefValue(addr, casFeatCode_answer, v);
  }

  /** @generated */
  final Feature casFeat_question;

  /** @generated */
  final int casFeatCode_question;

  /** @generated */
  public int getQuestion(int addr) {
    if (featOkTst && casFeat_question == null)
      jcas.throwFeatMissing("question", "edu.cmu.lti.deiis.qa.types.AnswerScore");
    return ll_cas.ll_getRefValue(addr, casFeatCode_question);
  }

  /** @generated */
  public void setQuestion(int addr, int v) {
    if (featOkTst && casFeat_question == null)
      jcas.throwFeatMissing("question", "edu.cmu.lti.deiis.qa.types.AnswerScore");
    ll_cas.ll_setRefValue(addr, casFeatCode_question, v);
  }

  /** @generated */
  final Feature casFeat_score;

  /** @generated */
  final int casFeatCode_score;

  /** @generated */
  public double getScore(int addr) {
    if (featOkTst && casFeat_score == null)
      jcas.throwFeatMissing("score", "edu.cmu.lti.deiis.qa.types.AnswerScore");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_score);
  }

  /** @generated */
  public void setScore(int addr, double v) {
    if (featOkTst && casFeat_score == null)
      jcas.throwFeatMissing("score", "edu.cmu.lti.deiis.qa.types.AnswerScore");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_score, v);
  }

  /**
   * initialize variables to correspond with Cas Type and Features
   * 
   * @generated
   */
  public AnswerScore_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());

    casFeat_answer = jcas.getRequiredFeatureDE(casType, "answer",
            "edu.cmu.lti.deiis.qa.types.Answer", featOkTst);
    casFeatCode_answer = (null == casFeat_answer) ? JCas.INVALID_FEATURE_CODE
            : ((FeatureImpl) casFeat_answer).getCode();

    casFeat_question = jcas.getRequiredFeatureDE(casType, "question",
            "edu.cmu.lti.deiis.qa.types.Question", featOkTst);
    casFeatCode_question = (null == casFeat_question) ? JCas.INVALID_FEATURE_CODE
            : ((FeatureImpl) casFeat_question).getCode();

    casFeat_score = jcas.getRequiredFeatureDE(casType, "score", "uima.cas.Double", featOkTst);
    casFeatCode_score = (null == casFeat_score) ? JCas.INVALID_FEATURE_CODE
            : ((FeatureImpl) casFeat_score).getCode();

  }
}
