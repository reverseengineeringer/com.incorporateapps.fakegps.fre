package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.internal.request.RequestUpdateOutcomes;
import com.google.android.gms.games.request.Requests.UpdateRequestsResult;
import java.util.Set;

final class GamesClientImpl$UpdateRequestsResultImpl
  extends GamesClientImpl.GamesDataHolderResult
  implements Requests.UpdateRequestsResult
{
  private final RequestUpdateOutcomes zzaFB;
  
  GamesClientImpl$UpdateRequestsResultImpl(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
    zzaFB = RequestUpdateOutcomes.zzab(paramDataHolder);
  }
  
  public final Set getRequestIds()
  {
    return zzaFB.getRequestIds();
  }
  
  public final int getRequestOutcome(String paramString)
  {
    return zzaFB.getRequestOutcome(paramString);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.UpdateRequestsResultImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */