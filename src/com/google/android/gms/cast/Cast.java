package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zzk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zza;

public final class Cast
{
  public static final int ACTIVE_INPUT_STATE_NO = 0;
  public static final int ACTIVE_INPUT_STATE_UNKNOWN = -1;
  public static final int ACTIVE_INPUT_STATE_YES = 1;
  public static final Api API = new Api("Cast.API", zzUJ, zzk.zzUI);
  public static final Cast.CastApi CastApi = new Cast.CastApi.zza();
  public static final String EXTRA_APP_NO_LONGER_RUNNING = "com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING";
  public static final int MAX_MESSAGE_LENGTH = 65536;
  public static final int MAX_NAMESPACE_LENGTH = 128;
  public static final int STANDBY_STATE_NO = 0;
  public static final int STANDBY_STATE_UNKNOWN = -1;
  public static final int STANDBY_STATE_YES = 1;
  private static final Api.zza zzUJ = new Cast.1();
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.Cast
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */