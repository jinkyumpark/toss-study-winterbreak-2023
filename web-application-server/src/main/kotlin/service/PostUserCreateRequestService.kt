package service

import db.UserRepository
import exception.ResponseStatusException
import model.*

object PostUserCreateRequestService : RequestService {
    override fun process(
        method: HttpMethod?,
        url: String?,
        headers: Map<String, String>,
        body: Map<String, String>,
        cookie: Map<String, String>,
        urlParameters: Map<String, String>,
    ): RequestProcessed {
        val userId = body["userId"] ?: throw ResponseStatusException(HttpStatus.BAD_REQUEST)
        val password = body["password"] ?: throw ResponseStatusException(HttpStatus.BAD_REQUEST)
        val name = body["name"] ?: throw ResponseStatusException(HttpStatus.BAD_REQUEST)

        val user = User(
            userId = userId,
            password = password,
            name = name,
            email = null,
        )
        UserRepository.add(user)

        val responseHeaders = mapOf(
            HttpHeader.REDIRECT_URL to "/index.html",
        )

        return RequestProcessed(
            headers = responseHeaders,
            status = HttpStatus.REDIRECT,
            body = RequestProcessed.Body(
                contentType = HttpContentType.HTML,
                data = byteArrayOf(),
            ),
        )
    }
}