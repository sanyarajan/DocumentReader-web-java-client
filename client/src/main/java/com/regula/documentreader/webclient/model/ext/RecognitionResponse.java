package com.regula.documentreader.webclient.model.ext;

import com.regula.documentreader.webclient.model.AuthenticityResult;
import com.regula.documentreader.webclient.model.ImagesResult;
import com.regula.documentreader.webclient.model.ProcessResponse;
import com.regula.documentreader.webclient.model.Result;
import com.regula.documentreader.webclient.model.ResultItem;
import com.regula.documentreader.webclient.model.Status;
import com.regula.documentreader.webclient.model.StatusResult;
import com.regula.documentreader.webclient.model.TextResult;
import com.regula.documentreader.webclient.model.ext.authenticity.Authenticity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class RecognitionResponse {
  private final ProcessResponse originalResponse;

  public RecognitionResponse(ProcessResponse originalResponse) {
    this.originalResponse = originalResponse;
  }

  public ProcessResponse getOriginalResponse() {
    return originalResponse;
  }

  @Nullable
  public Status status() {
    StatusResult result = resultByType(Result.STATUS);
    if (result != null) {
      return result.getStatus();
    }
    return null;
  }

  @Nullable
  public Text text() {
    TextResult result = resultByType(Result.TEXT);
    if (result != null) {
      return result.getText();
    }
    return null;
  }

  @Nullable
  public Images images() {
    ImagesResult result = resultByType(Result.IMAGES);
    if (result != null) {
      return result.getImages();
    }
    return null;
  }

  @Nullable
  public Authenticity authenticity() {
    AuthenticityResult result = resultByType(Result.AUTHENTICITY);
    if (result != null) {
      return result.getAuthenticityCheckList();
    }
    return null;
  }

  public <R> R resultByType(int type) {
    for (ResultItem item : originalResponse.getContainerList().getList()) {
      if (item.getResultType() == type) {
        return (R) item;
      }
    }
    return null;
  }

  public <R> List<R> resultsByType(int type) {
    List<R> results = new ArrayList<>();
    for (ResultItem item : originalResponse.getContainerList().getList()) {
      if (item.getResultType() == type) {
        results.add((R) item);
      }
    }
    return results;
  }
}
