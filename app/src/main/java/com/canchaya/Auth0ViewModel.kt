package com.canchaya

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import android.content.Context
import com.auth0.android.Auth0
import com.auth0.android.provider.WebAuthProvider
import com.auth0.android.callback.Callback
import com.auth0.android.authentication.AuthenticationException
import com.auth0.android.result.Credentials
import android.util.Log


class Auth0ViewModel: ViewModel() {

    var appJustLaunched by mutableStateOf(true)
    var userIsAuthenticated by mutableStateOf(false)

    private val TAG = "MainViewModel"
    private lateinit var account: Auth0

    private lateinit var context: Context

    fun setContext(activityContext: Context) {
        context = activityContext
        account = Auth0.getInstance(
            context.getString(R.string.com_auth0_client_id),
            context.getString(R.string.com_auth0_domain)
        )
    }


    fun login() {
        WebAuthProvider
            .login(account)
            .withScheme(context.getString(R.string.com_auth0_scheme))
            .start(context, object : Callback<Credentials, AuthenticationException> {

                override fun onFailure(error: AuthenticationException) {
                    Log.e(TAG, "Error occurred in login(): $error")
                }

                override fun onSuccess(result: Credentials) {
                    userIsAuthenticated = true
                    appJustLaunched = false
                }

            })
    }

    fun logout() {
        WebAuthProvider
            .logout(account)
            .withScheme(context.getString(R.string.com_auth0_scheme))
            .start(context, object : Callback<Void?, AuthenticationException> {

                override fun onFailure(error: AuthenticationException) {
                    Log.e(TAG, "Error occurred in logout(): $error")
                }

                override fun onSuccess(result: Void?) {
                    userIsAuthenticated = false
                }

            })
    }
}