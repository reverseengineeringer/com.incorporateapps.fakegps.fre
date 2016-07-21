package com.google.android.gms.auth.api.credentials;

import com.google.android.gms.common.internal.zzx;

public final class HintRequest$Builder
{
  private String[] zzWe;
  private CredentialPickerConfig zzWh = new CredentialPickerConfig.Builder().build();
  private boolean zzWi;
  private boolean zzWj;
  
  public final HintRequest build()
  {
    if (zzWe == null) {
      zzWe = new String[0];
    }
    if ((!zzWi) && (!zzWj) && (zzWe.length == 0)) {
      throw new IllegalStateException("At least one authentication method must be specified");
    }
    return new HintRequest(this, null);
  }
  
  public final Builder setAccountTypes(String... paramVarArgs)
  {
    String[] arrayOfString = paramVarArgs;
    if (paramVarArgs == null) {
      arrayOfString = new String[0];
    }
    zzWe = arrayOfString;
    return this;
  }
  
  public final Builder setEmailAddressIdentifierSupported(boolean paramBoolean)
  {
    zzWi = paramBoolean;
    return this;
  }
  
  public final Builder setHintPickerConfig(CredentialPickerConfig paramCredentialPickerConfig)
  {
    zzWh = ((CredentialPickerConfig)zzx.zzz(paramCredentialPickerConfig));
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.credentials.HintRequest.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */