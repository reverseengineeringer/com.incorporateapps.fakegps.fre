package com.google.android.gms.games.internal.request;

import com.google.android.gms.games.internal.constants.RequestUpdateResultOutcome;
import java.util.HashMap;

public final class RequestUpdateOutcomes$Builder
{
  private HashMap zzaIY = new HashMap();
  private int zzade = 0;
  
  public final Builder zzgG(int paramInt)
  {
    zzade = paramInt;
    return this;
  }
  
  public final Builder zzx(String paramString, int paramInt)
  {
    if (RequestUpdateResultOutcome.isValid(paramInt)) {
      zzaIY.put(paramString, Integer.valueOf(paramInt));
    }
    return this;
  }
  
  public final RequestUpdateOutcomes zzxH()
  {
    return new RequestUpdateOutcomes(zzade, zzaIY, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.request.RequestUpdateOutcomes.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */