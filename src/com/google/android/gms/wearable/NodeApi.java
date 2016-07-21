package com.google.android.gms.wearable;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

public abstract interface NodeApi
{
  public abstract PendingResult addListener(GoogleApiClient paramGoogleApiClient, NodeApi.NodeListener paramNodeListener);
  
  public abstract PendingResult getConnectedNodes(GoogleApiClient paramGoogleApiClient);
  
  public abstract PendingResult getLocalNode(GoogleApiClient paramGoogleApiClient);
  
  public abstract PendingResult removeListener(GoogleApiClient paramGoogleApiClient, NodeApi.NodeListener paramNodeListener);
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.NodeApi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */