package com.google.android.gms.internal;

import android.os.IInterface;
import com.google.android.gms.nearby.connection.AppMetadata;

public abstract interface zzqm
  extends IInterface
{
  public abstract void onConnectionRequest(String paramString1, String paramString2, String paramString3, byte[] paramArrayOfByte);
  
  public abstract void onDisconnected(String paramString);
  
  public abstract void onEndpointFound(String paramString1, String paramString2, String paramString3, String paramString4);
  
  public abstract void onEndpointLost(String paramString);
  
  public abstract void onMessageReceived(String paramString, byte[] paramArrayOfByte, boolean paramBoolean);
  
  public abstract void zza(String paramString, int paramInt, byte[] paramArrayOfByte);
  
  public abstract void zza(String paramString1, String paramString2, String paramString3, String paramString4, AppMetadata paramAppMetadata);
  
  public abstract void zzfy(String paramString);
  
  public abstract void zziW(int paramInt);
  
  public abstract void zziX(int paramInt);
  
  public abstract void zziY(int paramInt);
  
  public abstract void zziZ(int paramInt);
  
  public abstract void zzja(int paramInt);
  
  public abstract void zzm(int paramInt, String paramString);
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzqm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */