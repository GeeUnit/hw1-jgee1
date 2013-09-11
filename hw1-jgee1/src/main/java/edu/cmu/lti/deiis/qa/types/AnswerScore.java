/* First created by JCasGen Tue Sep 10 22:07:54 EDT 2013 */
package edu.cmu.lti.deiis.qa.types;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

/**
 * score given by a scoring mechanism for a specific question-answer pair. Updated by JCasGen Tue
 * Sep 10 22:11:21 EDT 2013 XML source:
 * /home/jeff/workspace/11791/hw1-jgee1/src/main/resources/hw1-jgee1-typesystem.xml
 * 
 * @generated
 */
public class AnswerScore extends QAAnnotation {
  /**
   * @generated
   * @ordered
   */
  @SuppressWarnings("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnswerScore.class);

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
  protected AnswerScore() {/* intentionally empty block */
  }

  /**
   * Internal - constructor used by generator
   * 
   * @generated
   */
  public AnswerScore(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }

  /** @generated */
  public AnswerScore(JCas jcas) {
    super(jcas);
    readObject();
  }

  /** @generated */
  public AnswerScore(JCas jcas, int begin, int end) {
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
  // * Feature: answer

  /**
   * getter for answer - gets Answer that this answer score belongs to.
   * 
   * @generated
   */
  public Answer getAnswer() {
    if (AnswerScore_Type.featOkTst && ((AnswerScore_Type) jcasType).casFeat_answer == null)
      jcasType.jcas.throwFeatMissing("answer", "edu.cmu.lti.deiis.qa.types.AnswerScore");
    return (Answer) (jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr,
            ((AnswerScore_Type) jcasType).casFeatCode_answer)));
  }

  /**
   * setter for answer - sets Answer that this answer score belongs to.
   * 
   * @generated
   */
  public void setAnswer(Answer v) {
    if (AnswerScore_Type.featOkTst && ((AnswerScore_Type) jcasType).casFeat_answer == null)
      jcasType.jcas.throwFeatMissing("answer", "edu.cmu.lti.deiis.qa.types.AnswerScore");
    jcasType.ll_cas.ll_setRefValue(addr, ((AnswerScore_Type) jcasType).casFeatCode_answer,
            jcasType.ll_cas.ll_getFSRef(v));
  }

  // *--------------*
  // * Feature: question

  /**
   * getter for question - gets Question for which this answer score pertains to.
   * 
   * @generated
   */
  public Question getQuestion() {
    if (AnswerScore_Type.featOkTst && ((AnswerScore_Type) jcasType).casFeat_question == null)
      jcasType.jcas.throwFeatMissing("question", "edu.cmu.lti.deiis.qa.types.AnswerScore");
    return (Question) (jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr,
            ((AnswerScore_Type) jcasType).casFeatCode_question)));
  }

  /**
   * setter for question - sets Question for which this answer score pertains to.
   * 
   * @generated
   */
  public void setQuestion(Question v) {
    if (AnswerScore_Type.featOkTst && ((AnswerScore_Type) jcasType).casFeat_question == null)
      jcasType.jcas.throwFeatMissing("question", "edu.cmu.lti.deiis.qa.types.AnswerScore");
    jcasType.ll_cas.ll_setRefValue(addr, ((AnswerScore_Type) jcasType).casFeatCode_question,
            jcasType.ll_cas.ll_getFSRef(v));
  }

  // *--------------*
  // * Feature: score

  /**
   * getter for score - gets the score value (between 0 and 1) for a question and answer pair.
   * 
   * @generated
   */
  public double getScore() {
    if (AnswerScore_Type.featOkTst && ((AnswerScore_Type) jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "edu.cmu.lti.deiis.qa.types.AnswerScore");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((AnswerScore_Type) jcasType).casFeatCode_score);
  }

  /**
   * setter for score - sets the score value (between 0 and 1) for a question and answer pair.
   * 
   * @generated
   */
  public void setScore(double v) {
    if (AnswerScore_Type.featOkTst && ((AnswerScore_Type) jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "edu.cmu.lti.deiis.qa.types.AnswerScore");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((AnswerScore_Type) jcasType).casFeatCode_score, v);
  }
}
