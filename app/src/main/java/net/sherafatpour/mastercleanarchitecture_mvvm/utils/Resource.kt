package net.sherafatpour.mastercleanarchitecture_mvvm.utils

sealed class Resource<T>(val data: T?=null,val message: String?=null) {

    class Idle<T>(data:T?=null) : Resource<T>(data)
    class Loading<T>(data:T?=null) : Resource<T>(data)
     class Success<T>(data:T) : Resource<T>(data)
     class Error<T>(message: String?, data: T?=null) : Resource<T>(data,message)

}
