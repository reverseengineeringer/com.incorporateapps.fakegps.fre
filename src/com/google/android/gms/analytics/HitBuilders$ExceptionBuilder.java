package com.google.android.gms.analytics;

import com.google.android.gms.analytics.internal.zzam;

public class HitBuilders$ExceptionBuilder
  extends HitBuilders.HitBuilder
{
  public HitBuilders$ExceptionBuilder()
  {
    set("&t", "exception");
  }
  
  public ExceptionBuilder setDescription(String paramString)
  {
    set("&exd", paramString);
    return this;
  }
  
  public ExceptionBuilder setFatal(boolean paramBoolean)
  {
    set("&exf", zzam.zzK(paramBoolean));
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.analytics.HitBuilders.ExceptionBuilder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */