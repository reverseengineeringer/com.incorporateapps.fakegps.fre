package com.google.android.gms.cast;

import com.google.android.gms.common.api.GoogleApiClient;
import org.json.JSONObject;

class RemoteMediaPlayer$22
  extends RemoteMediaPlayer.zzb
{
  RemoteMediaPlayer$22(RemoteMediaPlayer paramRemoteMediaPlayer, GoogleApiClient paramGoogleApiClient1, GoogleApiClient paramGoogleApiClient2, boolean paramBoolean, JSONObject paramJSONObject)
  {
    super(paramGoogleApiClient1);
  }
  
  /* Error */
  protected void zza(com.google.android.gms.cast.internal.zze paramzze)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 16	com/google/android/gms/cast/RemoteMediaPlayer$22:zzabK	Lcom/google/android/gms/cast/RemoteMediaPlayer;
    //   4: invokestatic 38	com/google/android/gms/cast/RemoteMediaPlayer:zze	(Lcom/google/android/gms/cast/RemoteMediaPlayer;)Ljava/lang/Object;
    //   7: astore_1
    //   8: aload_1
    //   9: monitorenter
    //   10: aload_0
    //   11: getfield 16	com/google/android/gms/cast/RemoteMediaPlayer$22:zzabK	Lcom/google/android/gms/cast/RemoteMediaPlayer;
    //   14: invokestatic 42	com/google/android/gms/cast/RemoteMediaPlayer:zzf	(Lcom/google/android/gms/cast/RemoteMediaPlayer;)Lcom/google/android/gms/cast/RemoteMediaPlayer$zza;
    //   17: aload_0
    //   18: getfield 18	com/google/android/gms/cast/RemoteMediaPlayer$22:zzabL	Lcom/google/android/gms/common/api/GoogleApiClient;
    //   21: invokevirtual 47	com/google/android/gms/cast/RemoteMediaPlayer$zza:zzc	(Lcom/google/android/gms/common/api/GoogleApiClient;)V
    //   24: aload_0
    //   25: getfield 16	com/google/android/gms/cast/RemoteMediaPlayer$22:zzabK	Lcom/google/android/gms/cast/RemoteMediaPlayer;
    //   28: invokestatic 51	com/google/android/gms/cast/RemoteMediaPlayer:zzg	(Lcom/google/android/gms/cast/RemoteMediaPlayer;)Lcom/google/android/gms/cast/internal/zzm;
    //   31: aload_0
    //   32: getfield 55	com/google/android/gms/cast/RemoteMediaPlayer$22:zzacm	Lcom/google/android/gms/cast/internal/zzo;
    //   35: aload_0
    //   36: getfield 20	com/google/android/gms/cast/RemoteMediaPlayer$22:zzach	Z
    //   39: aload_0
    //   40: getfield 22	com/google/android/gms/cast/RemoteMediaPlayer$22:zzabS	Lorg/json/JSONObject;
    //   43: invokevirtual 60	com/google/android/gms/cast/internal/zzm:zza	(Lcom/google/android/gms/cast/internal/zzo;ZLorg/json/JSONObject;)J
    //   46: pop2
    //   47: aload_0
    //   48: getfield 16	com/google/android/gms/cast/RemoteMediaPlayer$22:zzabK	Lcom/google/android/gms/cast/RemoteMediaPlayer;
    //   51: invokestatic 42	com/google/android/gms/cast/RemoteMediaPlayer:zzf	(Lcom/google/android/gms/cast/RemoteMediaPlayer;)Lcom/google/android/gms/cast/RemoteMediaPlayer$zza;
    //   54: aconst_null
    //   55: invokevirtual 47	com/google/android/gms/cast/RemoteMediaPlayer$zza:zzc	(Lcom/google/android/gms/common/api/GoogleApiClient;)V
    //   58: aload_1
    //   59: monitorexit
    //   60: return
    //   61: astore_2
    //   62: aload_0
    //   63: aload_0
    //   64: new 62	com/google/android/gms/common/api/Status
    //   67: dup
    //   68: sipush 2100
    //   71: invokespecial 65	com/google/android/gms/common/api/Status:<init>	(I)V
    //   74: invokevirtual 69	com/google/android/gms/cast/RemoteMediaPlayer$22:zzq	(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/cast/RemoteMediaPlayer$MediaChannelResult;
    //   77: invokevirtual 72	com/google/android/gms/cast/RemoteMediaPlayer$22:zza	(Lcom/google/android/gms/common/api/Result;)V
    //   80: aload_0
    //   81: getfield 16	com/google/android/gms/cast/RemoteMediaPlayer$22:zzabK	Lcom/google/android/gms/cast/RemoteMediaPlayer;
    //   84: invokestatic 42	com/google/android/gms/cast/RemoteMediaPlayer:zzf	(Lcom/google/android/gms/cast/RemoteMediaPlayer;)Lcom/google/android/gms/cast/RemoteMediaPlayer$zza;
    //   87: aconst_null
    //   88: invokevirtual 47	com/google/android/gms/cast/RemoteMediaPlayer$zza:zzc	(Lcom/google/android/gms/common/api/GoogleApiClient;)V
    //   91: goto -33 -> 58
    //   94: astore_2
    //   95: aload_1
    //   96: monitorexit
    //   97: aload_2
    //   98: athrow
    //   99: astore_2
    //   100: aload_0
    //   101: getfield 16	com/google/android/gms/cast/RemoteMediaPlayer$22:zzabK	Lcom/google/android/gms/cast/RemoteMediaPlayer;
    //   104: invokestatic 42	com/google/android/gms/cast/RemoteMediaPlayer:zzf	(Lcom/google/android/gms/cast/RemoteMediaPlayer;)Lcom/google/android/gms/cast/RemoteMediaPlayer$zza;
    //   107: aconst_null
    //   108: invokevirtual 47	com/google/android/gms/cast/RemoteMediaPlayer$zza:zzc	(Lcom/google/android/gms/common/api/GoogleApiClient;)V
    //   111: aload_2
    //   112: athrow
    //   113: astore_2
    //   114: goto -52 -> 62
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	117	0	this	22
    //   0	117	1	paramzze	com.google.android.gms.cast.internal.zze
    //   61	1	2	localIllegalStateException	IllegalStateException
    //   94	4	2	localObject1	Object
    //   99	13	2	localObject2	Object
    //   113	1	2	localIOException	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   24	47	61	java/lang/IllegalStateException
    //   10	24	94	finally
    //   47	58	94	finally
    //   58	60	94	finally
    //   80	91	94	finally
    //   100	113	94	finally
    //   24	47	99	finally
    //   62	80	99	finally
    //   24	47	113	java/io/IOException
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.RemoteMediaPlayer.22
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */