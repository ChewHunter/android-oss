package com.kickstarter.viewmodels.outputs;

import android.support.annotation.NonNull;

import rx.Observable;

public interface LoginToutViewModelOutputs {
  /**
   * Emits when a user has successfully logged in; the login flow should be finished with a result indicating success.
   */
  @NonNull Observable<Void> finishWithSuccessfulResult();

  /**
   * Emits when the login activity should be started.
   */
  @NonNull Observable<Void> startLogin();

  /**
   * Emits when the signup activity should be started.
   */
  @NonNull Observable<Void> startSignup();
}
