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
 * Annotation used to distinguish a Question statement. Updated by JCasGen Tue Sep 10 22:11:21 EDT
 * 2013
 * 
 * @generated
 */
public class Question_Type extends StatementBase_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {
    return fsGenerator;
  }

  /** @generated */
  private final FSGenerator fsGenerator = new FSGenerator() {
    public FeatureStructure createFS(int addr, CASImpl cas) {
      if (Question_Type.this.useExistingInstance) {
        // Return eq fs instance if already created
        FeatureStructure fs = Question_Type.this.jcas.getJfsFromCaddr(addr);
        if (null == fs) {
          fs = new Question(addr, Question_Type.this);
          Question_Type.this.jcas.putJfsFromCaddr(addr, fs);
          return fs;
        }
        return fs;
      } else
        return new Question(addr, Question_Type.this);
    }
  };

  /** @generated */
  @SuppressWarnings("hiding")
  public final static int typeIndexID = Question.typeIndexID;

  /**
   * @generated
   * @modifiable
   */
  @SuppressWarnings("hiding")
  public final static boolean featOkTst = JCasRegistry
          .getFeatOkTst("edu.cmu.lti.deiis.qa.types.Question");

  /** @generated */
  final Feature casFeat_candidateAnswers;

  /** @generated */
  final int casFeatCode_candidateAnswers;

  /** @generated */
  public int getCandidateAnswers(int addr) {
    if (featOkTst && casFeat_candidateAnswers == null)
      jcas.throwFeatMissing("candidateAnswers", "edu.cmu.lti.deiis.qa.types.Question");
    return ll_cas.ll_getRefValue(addr, casFeatCode_candidateAnswers);
  }

  /** @generated */
  public void setCandidateAnswers(int addr, int v) {
    if (featOkTst && casFeat_candidateAnswers == null)
      jcas.throwFeatMissing("candidateAnswers", "edu.cmu.lti.deiis.qa.types.Question");
    ll_cas.ll_setRefValue(addr, casFeatCode_candidateAnswers, v);
  }

  /**
   * initialize variables to correspond with Cas Type and Features
   * 
   * @generated
   */
  public Question_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());

    casFeat_candidateAnswers = jcas.getRequiredFeatureDE(casType, "candidateAnswers",
            "uima.cas.FSList", featOkTst);
    casFeatCode_candidateAnswers = (null == casFeat_candidateAnswers) ? JCas.INVALID_FEATURE_CODE
            : ((FeatureImpl) casFeat_candidateAnswers).getCode();

  }
}
