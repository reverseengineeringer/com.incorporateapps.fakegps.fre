package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.request.GameRequestBuffer;
import com.google.android.gms.games.request.Requests.LoadRequestsResult;

class RequestsImpl$LoadRequestsImpl$1
  implements Requests.LoadRequestsResult
{
  RequestsImpl$LoadRequestsImpl$1(RequestsImpl.LoadRequestsImpl paramLoadRequestsImpl, Status paramStatus) {}
  
  public GameRequestBuffer getRequests(int paramInt)
  {
    return new GameRequestBuffer(DataHolder.zzbI(zzZR.getStatusCode()));
  }
  
  public Status getStatus()
  {
    return zzZR;
  }
  
  public void release() {}
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.api.RequestsImpl.LoadRequestsImpl.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */