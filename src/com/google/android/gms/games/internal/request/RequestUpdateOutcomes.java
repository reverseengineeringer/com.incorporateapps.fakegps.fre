package com.google.android.gms.games.internal.request;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzx;
import java.util.HashMap;
import java.util.Set;

public final class RequestUpdateOutcomes
{
  private static final String[] zzaIX = { "requestId", "outcome" };
  private final HashMap zzaIY;
  private final int zzade;
  
  private RequestUpdateOutcomes(int paramInt, HashMap paramHashMap)
  {
    zzade = paramInt;
    zzaIY = paramHashMap;
  }
  
  public static RequestUpdateOutcomes zzab(DataHolder paramDataHolder)
  {
    RequestUpdateOutcomes.Builder localBuilder = new RequestUpdateOutcomes.Builder();
    localBuilder.zzgG(paramDataHolder.getStatusCode());
    int j = paramDataHolder.getCount();
    int i = 0;
    while (i < j)
    {
      int k = paramDataHolder.zzbH(i);
      localBuilder.zzx(paramDataHolder.zzd("requestId", i, k), paramDataHolder.zzc("outcome", i, k));
      i += 1;
    }
    return localBuilder.zzxH();
  }
  
  public final Set getRequestIds()
  {
    return zzaIY.keySet();
  }
  
  public final int getRequestOutcome(String paramString)
  {
    zzx.zzb(zzaIY.containsKey(paramString), "Request " + paramString + " was not part of the update operation!");
    return ((Integer)zzaIY.get(paramString)).intValue();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.request.RequestUpdateOutcomes
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */