package com.google.android.gms.games.internal.api;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.request.OnRequestReceivedListener;
import com.google.android.gms.games.request.Requests;
import java.util.ArrayList;
import java.util.List;

public final class RequestsImpl
  implements Requests
{
  public final PendingResult acceptRequest(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramString);
    return acceptRequests(paramGoogleApiClient, localArrayList);
  }
  
  public final PendingResult acceptRequests(GoogleApiClient paramGoogleApiClient, List paramList)
  {
    if (paramList == null) {}
    for (paramList = null;; paramList = (String[])paramList.toArray(new String[paramList.size()])) {
      return paramGoogleApiClient.zzb(new RequestsImpl.1(this, paramGoogleApiClient, paramList));
    }
  }
  
  public final PendingResult dismissRequest(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramString);
    return dismissRequests(paramGoogleApiClient, localArrayList);
  }
  
  public final PendingResult dismissRequests(GoogleApiClient paramGoogleApiClient, List paramList)
  {
    if (paramList == null) {}
    for (paramList = null;; paramList = (String[])paramList.toArray(new String[paramList.size()])) {
      return paramGoogleApiClient.zzb(new RequestsImpl.2(this, paramGoogleApiClient, paramList));
    }
  }
  
  public final ArrayList getGameRequestsFromBundle(Bundle paramBundle)
  {
    if ((paramBundle == null) || (!paramBundle.containsKey("requests"))) {
      return new ArrayList();
    }
    paramBundle = (ArrayList)paramBundle.get("requests");
    ArrayList localArrayList = new ArrayList();
    int j = paramBundle.size();
    int i = 0;
    while (i < j)
    {
      localArrayList.add((GameRequest)paramBundle.get(i));
      i += 1;
    }
    return localArrayList;
  }
  
  public final ArrayList getGameRequestsFromInboxResponse(Intent paramIntent)
  {
    if (paramIntent == null) {
      return new ArrayList();
    }
    return getGameRequestsFromBundle(paramIntent.getExtras());
  }
  
  public final Intent getInboxIntent(GoogleApiClient paramGoogleApiClient)
  {
    return Games.zzh(paramGoogleApiClient).zzwM();
  }
  
  public final int getMaxLifetimeDays(GoogleApiClient paramGoogleApiClient)
  {
    return Games.zzh(paramGoogleApiClient).zzwO();
  }
  
  public final int getMaxPayloadSize(GoogleApiClient paramGoogleApiClient)
  {
    return Games.zzh(paramGoogleApiClient).zzwN();
  }
  
  public final Intent getSendIntent(GoogleApiClient paramGoogleApiClient, int paramInt1, byte[] paramArrayOfByte, int paramInt2, Bitmap paramBitmap, String paramString)
  {
    return Games.zzh(paramGoogleApiClient).zza(paramInt1, paramArrayOfByte, paramInt2, paramBitmap, paramString);
  }
  
  public final PendingResult loadRequests(GoogleApiClient paramGoogleApiClient, int paramInt1, int paramInt2, int paramInt3)
  {
    return paramGoogleApiClient.zza(new RequestsImpl.3(this, paramGoogleApiClient, paramInt1, paramInt2, paramInt3));
  }
  
  public final void registerRequestListener(GoogleApiClient paramGoogleApiClient, OnRequestReceivedListener paramOnRequestReceivedListener)
  {
    GamesClientImpl localGamesClientImpl = Games.zzb(paramGoogleApiClient, false);
    if (localGamesClientImpl != null) {
      localGamesClientImpl.zzd(paramGoogleApiClient.zzr(paramOnRequestReceivedListener));
    }
  }
  
  public final void unregisterRequestListener(GoogleApiClient paramGoogleApiClient)
  {
    paramGoogleApiClient = Games.zzb(paramGoogleApiClient, false);
    if (paramGoogleApiClient != null) {
      paramGoogleApiClient.zzwG();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.api.RequestsImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */