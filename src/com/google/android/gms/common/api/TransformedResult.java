package com.google.android.gms.common.api;

public abstract class TransformedResult
{
  public abstract void andFinally(ResultCallbacks paramResultCallbacks);
  
  public abstract TransformedResult then(ResultTransform paramResultTransform);
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.api.TransformedResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */